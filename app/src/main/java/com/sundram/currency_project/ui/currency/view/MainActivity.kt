package com.sundram.currency_project.ui.currency.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sundram.currency_project.R
import com.sundram.currency_project.databinding.ActivityMainBinding
import com.sundram.currency_project.ui.currency.viewmodel.CurrencyViewModel
import org.json.JSONException
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val myViewModel: CurrencyViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        myViewModel.posts.observe(this@MainActivity) {
            Log.e("HULK_007", "onCreate: ${it.symbols}")
            Log.e("HULK_007", "onCreate: ${it.success}")
        }
//        myViewModel.getCurrencySymbol()

        binding.run {
            convertBtn.setOnClickListener {
                if (amountEt.text.isNullOrBlank()) {
                    amountEt.requestFocus()
                    amountEt.error = "Please Enter Amount"
                    return@setOnClickListener
                }

                if (fromCurrencySymbol.text.isNullOrBlank()) {
                    amountEt.requestFocus()
                    amountEt.error = "Please Enter Currency Symbol"
                    return@setOnClickListener
                }
                if (toCurrencySymbol.text.isNullOrBlank()) {
                    amountEt.requestFocus()
                    amountEt.error = "Please Enter To Symbol"
                    return@setOnClickListener
                }
                progressBar.visibility= View.VISIBLE
                convertBtn.visibility=View.GONE
                myViewModel.onConvertCurrency(toCurrencySymbol.text.toString(),fromCurrencySymbol.text.toString(), amountEt.text.toString())
            }

            myViewModel.conversion.observe(this@MainActivity){
                Log.e("HULK_007", "onCreate: $it")
                if (it.success){
                    resultTV.text=it.result
                }else{
                    resultTV.text=it.error.info
                }
                progressBar.visibility=View.GONE
                convertBtn.visibility=View.VISIBLE
            }
        }
    }
}

inline fun <reified T> String.toModel(): T? {
    return try {
        Gson().fromJson(this, object : TypeToken<T>() {}.type)
    } catch (jsonException: JSONException) {
        null
    }
}