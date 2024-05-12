package com.itzdan0ul.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var country: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spinner = findViewById<Spinner>(R.id.spinner)
        val label = findViewById<TextView>(R.id.label)
        val button = findViewById<Button>(R.id.nextButton)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()

                label.text = when(selectedItem) {
                    "Estados Unidos" -> "Select your country"
                    "México" -> "Selecciona tu país"
                    "Brasil" -> "Selecione seu país"
                    "Francia" -> "Sélectionnez votre pays"
                    "Alemania" -> "Wählen Sie Ihr Land"
                    "Italia" -> "Seleziona il tuo paese"
                    else -> "Unknown"
                }

                button.text = when(selectedItem) {
                    "Estados Unidos" -> "Next"
                    "México" -> "Siguiente"
                    "Brasil" -> "Próximo"
                    "Francia" -> "Suivant"
                    "Alemania" -> "Weiter"
                    "Italia" -> "Avanti"
                    else -> "Unknown"
                }

                country = selectedItem
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // No implemented
            }
        }
    }

    fun onNothingSelected(parent: AdapterView<*>) {
        // No implemented
    }

    fun showAlertDialog(view: View) {
        val builder = AlertDialog.Builder(this)

        if (country == "Estados Unidos") {
            builder.setTitle("We welcome you!")
            builder.setMessage("This is a welcome message!")
            builder.show()
        } else if (country == "México") {
            builder.setTitle("¡Te damos la bienvenida!")
            builder.setMessage("Este es un mensaje de bienvenida")
            builder.show()
        } else if (country == "Brasil") {
            builder.setTitle("Seja bem-vindo!")
            builder.setMessage("Esta é uma mensagem de boas-vindas")
            builder.show()
        } else if (country == "Francia") {
            builder.setTitle("Nous vous souhaitons la bienvenue !")
            builder.setMessage("C'est un message de bienvenue")
            builder.show()
        } else if (country == "Alemania") {
            builder.setTitle("Wir heißen Sie willkommen!")
            builder.setMessage("Dies ist eine willkommene Nachricht")
            builder.show()
        } else if (country == "Italia") {
            builder.setTitle("Vi diamo il benvenuto!")
            builder.setMessage("Questo è un messaggio di benvenuto")
            builder.show()
        }
    }
}
