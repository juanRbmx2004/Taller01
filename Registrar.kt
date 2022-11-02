package com.example.login

import android.content.ContentValues
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Registrar : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)
        /*
        val BotonRegreso = findViewById<Button>(R.id.BotonVolver)
        BotonRegreso.setOnClickListener{
            val intentar = Intent(this, MainActivity::class.java)
            startActivity(intentar)
        }
        auth = Firebase.auth
        val BotonResgito = findViewById<Button>(R.id.botonRegistrar)
        BotonResgito.setOnClickListener {
            val correo = findViewById<EditText>(R.id.txt_user)
            val contraceña = findViewById<EditText>(R.id.txt_passwordR)
            val confirmar = findViewById<EditText>(R.id.txt_confirmar)
            try {
                val correoEmail = correo.text.toString()
                val contraceña1 = contraceña.text.toString()
                val contraceñaCon = confirmar.text.toString()
                if(correoEmail.isEmpty()||contraceña1.isEmpty()||contraceñaCon.isEmpty()){
                    throw Exception("Los campos no deben estar basios")
                }
                else if(contraceña1!=contraceñaCon){
                    throw Exception("Condirmar contraceña deben ser iguales")
                }
                else{
                    auth.createUserWithEmailAndPassword(correoEmail,contraceña1)
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                // Sign in success, update UI with the signed-in user's information
                                Toast.makeText(this, "Registrado",
                                    Toast.LENGTH_SHORT).show()
                                auth.signOut()
                                val intentar = Intent(this, MainActivity::class.java)
                                startActivity(intentar)

                            }
                            else {
                                // If sign in fails, display a message to the user.
                                Log.w(ContentValues.TAG, "signInWithCustomToken:failure", task.exception)
                                Toast.makeText(this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show()
                            }
                        }
                }
            }catch (e:Exception){
                Toast.makeText(this,"error internet o de conexion",Toast.LENGTH_SHORT).show()
            }
        }*/
    }
}