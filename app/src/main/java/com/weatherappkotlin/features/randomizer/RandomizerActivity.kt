package com.weatherappkotlin.features.randomizer

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.weatherappkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class RandomizerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel=ViewModelProviders.of(this).get(RandomizerViewModel::class.java)

        viewModel.numberLiveData.observe(this, Observer {
            random_number_text_view.text=(it.toString())
        })

        show_random_number_button.setOnClickListener {
            viewModel.incrementNumber()
        }

    }
}
