package com.kodego.app.studentassistanceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.kodego.app.studentassistanceapp.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
//            Toast.makeText(applicationContext,"Hello from Toast",Toast.LENGTH_LONG).show()
            var name : String = "Welcome Back, " + binding.etName.text.toString() + "!"
            binding.txtName.text =  name
        }

    }
}