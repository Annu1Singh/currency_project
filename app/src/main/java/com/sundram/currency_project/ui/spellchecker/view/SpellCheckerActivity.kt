package com.sundram.currency_project.ui.spellchecker.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.sundram.currency_project.R
import com.sundram.currency_project.databinding.ActivitySpellCheckerBinding
import com.sundram.currency_project.ui.spellchecker.viewmodel.SpellCheckerViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class SpellCheckerActivity : AppCompatActivity() {
    private val viewModel: SpellCheckerViewModel by viewModel()
    private lateinit var binding: ActivitySpellCheckerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spell_checker)
        binding = DataBindingUtil.setContentView(
            this@SpellCheckerActivity,
            R.layout.activity_spell_checker
        )
        binding.run {
            viewModel.response.observe(this@SpellCheckerActivity) {
                if (it.corrections.size > 0) {
                    if (it.corrections[0].candidates.size > 0) {
                        binding.showProgress.visibility = View.GONE
                        binding.convertBtn.visibility = View.VISIBLE
                        val adapter = ArrayAdapter(
                            this@SpellCheckerActivity,
                            android.R.layout.simple_list_item_1,
                            it.corrections[0].candidates
                        )
                        listView.adapter = adapter
                    }else{
                        binding.showProgress.visibility = View.GONE
                        binding.convertBtn.visibility = View.VISIBLE
                    }
                }else{
                    binding.showProgress.visibility = View.GONE
                    binding.convertBtn.visibility = View.VISIBLE
                }
            }
            convertBtn.setOnClickListener {
                if (enterTextET.text.toString().length > 2) {
                    binding.showProgress.visibility = View.VISIBLE
                    binding.convertBtn.visibility = View.GONE
                    viewModel.onSpellCheck(enterTextET.text.toString())
                } else {
                    Toast.makeText(
                        this@SpellCheckerActivity,
                        "Text too short. Min length: 3 characters",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            enterTextET.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                }

                override fun afterTextChanged(s: Editable?) {
                    if (s.toString().isEmpty()) {
                        listView.adapter = ArrayAdapter(
                            this@SpellCheckerActivity,
                            android.R.layout.simple_list_item_1,
                            ArrayList<String>()
                        )
                    }
                }
            })
        }
    }
}