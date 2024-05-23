package com.example.geoquizrubtsova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

lateinit var email: EditText
lateinit var password: EditText
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        email = findViewById(R.id.editTextTextEmailAddress)
        password = findViewById(R.id.editTextTextEmailAddress)
    }

    fun inn(view: View) {

        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()||email.text.toString()=="ekts" && password.text.toString()=="ekts2024") {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)

        } else  {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Данные неверны")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }






        }
}