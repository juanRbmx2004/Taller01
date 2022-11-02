package com.example.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage

class ListaLibros : AppCompatActivity() {
    var storage = Firebase.storage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_lista_libros)
        val storageRef = storage.reference
        val list_ListaLibros = findViewById<ListView>(R.id.list_libros)
        val libros_ean = ArrayList<String>()
        val listRef = storage.reference.child("libros")
*/
    }
}