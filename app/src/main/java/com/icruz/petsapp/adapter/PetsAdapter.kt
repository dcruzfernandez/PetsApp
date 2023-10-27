package com.icruz.petsapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.icruz.petsapp.Pet
import com.icruz.petsapp.R

class PetsAdapter(val petsLists:List<Pet>):RecyclerView.Adapter<PetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        //hay que definir los argumentos en PetsViewHolder
        return PetsViewHolder(layoutInflater.inflate(R.layout.item_pet, parent, false))
    }

    //Devuelve el tamano del listado
    override fun getItemCount(): Int = petsLists.size

    //este metodo va a pasar por cada uno de los items y va a llamar a la funcion inicializaSingers de SingersViewHolder
    override fun onBindViewHolder(holder: PetsViewHolder, position: Int) {
        var item = petsLists[position]
        holder.renderPets(item)
    }
}