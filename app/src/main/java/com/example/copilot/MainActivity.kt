package com.example.copilot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validarEmail("programadornovato.com")
    }
    //create a function that validates an email with a regular expression
    fun validarEmail(email: String)
    {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        val pattern = Pattern.compile(emailPattern)
        val matcher = pattern.matcher(email)
        if (matcher.matches())
        {
            var toast=Toast.makeText(this,"Email is valid", Toast.LENGTH_LONG)
            toast.show()
        }
        else
        {
            var toast=Toast.makeText(this,"Email is invalid", Toast.LENGTH_LONG)
            toast.show()
        }




    }
}