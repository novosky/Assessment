package com.oghenovo.Assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class signup : AppCompatActivity() {

    val validUserName = "Ovo"
    val validUserEmail = "Oghenovo@gmail.com"
    private val validPassword = "admin"


    //layout variables
    private lateinit var userNameInput: EditText
    private lateinit var userEmailInput: EditText
    private lateinit var userPasswordInput: EditText
    private lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        userNameInput = findViewById(R.id.userNameInput)
        userEmailInput = findViewById(R.id.userEmailInput)
        userPasswordInput = findViewById(R.id.userPasswordInput)
        signupButton = findViewById(R.id.signupButton)

        signupButton.setOnClickListener {
            val username = userNameInput.text.toString()
            val userEmail = userEmailInput.text.toString()
            val password = userPasswordInput.text.toString()

            signup(username, userEmail, password)

        }


    }
    private fun signup(username:String, userEmail: String, password:String) {
        if (isValidCredentials(username, userEmail, password)){
            val intent : Intent = Intent(this, Home::class.java)
            startActivity(intent)

        }else{
            Toast.makeText(applicationContext, "Sign UP unsuccessful", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValidCredentials(username:String, userEmail: String, password: String): Boolean{
        return (password == validPassword)
    }

}