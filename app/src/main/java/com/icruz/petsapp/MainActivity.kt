package com.icruz.petsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.icruz.petsapp.adapter.PetsAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initReciclerView()
    }
    fun initReciclerView(){
        val reciclerView = findViewById<RecyclerView>(R.id.recyclerPets)
        reciclerView.layoutManager = LinearLayoutManager(this)
        reciclerView.adapter = PetsAdapter(PetsProvider.petsList)
    }
}