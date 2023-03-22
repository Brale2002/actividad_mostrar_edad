package com.ventana.cambiodepagina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miButton:Button = findViewById(R.id.buttoningresar)
        miButton.setOnClickListener {onClick()}
    }

    private fun onClick() {
        val campoTextoDireccion:EditText = findViewById(R.id.editTextTextPersonName)
        val campoTextoTelefono:EditText = findViewById(R.id.editTextTextPersonName2)
        val campoTextoEmail:EditText = findViewById(R.id.editTextTextPersonName3)
        val campoTextoDocumento:EditText = findViewById(R.id.editTextTextPersonName4)
        val campoTextoEdad:EditText = findViewById(R.id.editTextTextPersonName5)

        var direccion:String = campoTextoDireccion.text.toString()
        var telefono:String = campoTextoTelefono.text.toString()
        var email:String = campoTextoEmail.text.toString()
        var documento:String = campoTextoDocumento.text.toString()
        var edad:String = campoTextoEdad.text.toString()

        val textResultado:TextView = findViewById(R.id.textView5)
        if (edad.toInt() < 15){
            Toast.makeText(this, "Es un infante", Toast.LENGTH_SHORT).show()
            textResultado.text = "Es un infante"
        }else if(edad.toInt() >= 15 && edad.toInt() <= 18){
            Toast.makeText(this, "Es un adolescente", Toast.LENGTH_SHORT).show()
            textResultado.text = "Es un adolescente"
        }else if(edad.toInt() > 18 && edad.toInt() < 66) {
            Toast.makeText(this, "Es un adulto", Toast.LENGTH_SHORT).show()
            textResultado.text = "Es un adulto"
        }else{
            Toast.makeText(this, "Es un adulto mayor", Toast.LENGTH_SHORT).show()
            textResultado.text = "Es un adulto mayor"
        }
    }
}