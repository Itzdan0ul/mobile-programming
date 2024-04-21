package com.itzdan0ul.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var nameTextField: EditText
    private lateinit var lastnameTextField: EditText
    private lateinit var phoneTextField: EditText
    private lateinit var emailTextField: EditText
    private lateinit var errorImageView: ImageView
    private lateinit var checkImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun checkUserInput(view: View): Unit {
        nameTextField = findViewById(R.id.nameTextField)
        lastnameTextField = findViewById(R.id.lastnameTextField)
        phoneTextField = findViewById(R.id.phoneTextField)
        emailTextField = findViewById(R.id.emailTextField)
        errorImageView = findViewById(R.id.errorImageView)
        checkImageView = findViewById(R.id.checkImageView)

        val name = nameTextField.text.toString()
        val lastname = lastnameTextField.text.toString()
        val phone = phoneTextField.text.toString()
        val email = emailTextField.text.toString()

        if (name.isEmpty()  || lastname.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            errorImageView.visibility = View.VISIBLE

            if (checkImageView.visibility == View.VISIBLE) {
                checkImageView.visibility = View.GONE
            }
        } else {
            checkImageView.visibility = View.VISIBLE

            if (errorImageView.visibility == View.VISIBLE) {
                errorImageView.visibility = View.GONE
            }
        }
    }
}