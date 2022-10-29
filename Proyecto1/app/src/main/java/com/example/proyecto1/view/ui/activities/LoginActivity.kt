package com.example.proyecto1.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.proyecto1.R

class LoginActivity : AppCompatActivity() {
    lateinit var Ingresabutton:Button
    lateinit var CrearCuentabutton:Button
    lateinit var OlvidasteContraseñabutton:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Ingresabutton=findViewById(R.id.BIngresa)
        CrearCuentabutton=findViewById(R.id.BCrearCuenta)
        OlvidasteContraseñabutton=findViewById(R.id.BOlvidasteContraseña)

        Ingresabutton.setOnClickListener {
            startActivity(Intent(this, paginaprincipalActivity::class.java))
        }

        CrearCuentabutton.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }

        OlvidasteContraseñabutton.setOnClickListener {
            startActivity(Intent(this, RestablecerActivity::class.java))
        }

        }

    }
