package com.example.reto3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.reto3.databinding.Reto3Binding

class reto3 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: Reto3Binding
    lateinit var user: EditText
    lateinit var pass: EditText
    var buttonAccept: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = Reto3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        user = binding.edTU
        pass = binding.edTP
        buttonAccept = binding.loginButton

        buttonAccept?.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.loginButton->{
                if(user.text.toString() != "" && pass.text.toString() != "")
                    validaLogin(user.text.toString(), pass.text.toString())
                else
                    showToast("No contiene texto...")
            }
        }
    }

    private fun validaLogin(username: String, password: String){
        val sessionToken = com.example.api.local_api().validateUser(username, password)

        if(sessionToken != null){
            val intent = Intent(this, reto3_menu::class.java).apply {
                putExtra("SESSION_TOKEN", sessionToken)
                putExtra("name", username)
            }
            startActivity(intent)
        }else {
            showToast("Credenciales incorrectas...")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}