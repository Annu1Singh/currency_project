package com.sundram.currency_project.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sundram.currency_project.R
import com.sundram.currency_project.databinding.ActivityHomeBinding
import com.sundram.currency_project.ui.currency.view.MainActivity
import com.sundram.currency_project.ui.spellchecker.view.SpellCheckerActivity

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this@HomeActivity,R.layout.activity_home)
        binding.currencyConvert.setOnClickListener {
            startActivity(Intent(this@HomeActivity,MainActivity::class.java))
        }
        binding.spellChecker.setOnClickListener {
            startActivity(Intent(this@HomeActivity,SpellCheckerActivity::class.java))
        }
    }
}