package com.example.notes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.floatingActionButton.setOnClickListener {
    var intent=Intent(this,Add_data::class.java).apply {

    }
            startActivity(intent)
        }

    }
}