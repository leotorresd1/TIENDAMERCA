package view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.proyecto3.R

class LoginActivity : AppCompatActivity() {
    lateinit var Ingresabutton:Button
    lateinit var CrearCuentabutton:Button
    lateinit var OlvidasteContrasenabutton:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Ingresabutton=findViewById(R.id.BIngresa)
        CrearCuentabutton=findViewById(R.id.BCrearCuenta)
        OlvidasteContrasenabutton=findViewById(R.id.BOlvidasteContraseña)

        Ingresabutton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        CrearCuentabutton.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }

        OlvidasteContrasenabutton.setOnClickListener {
            startActivity(Intent(this, RestablecerActivity::class.java))
        }

    }

}