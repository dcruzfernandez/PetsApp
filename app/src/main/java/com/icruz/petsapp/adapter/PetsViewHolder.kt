package com.icruz.petsapp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.icruz.petsapp.Pet
import com.icruz.petsapp.R

class PetsViewHolder(view:View):RecyclerView.ViewHolder(view) {
    //variables de componentes del Layout item_layout
    val petName = view.findViewById<TextView>(R.id.tvPet)
    val petKind = view.findViewById<TextView>(R.id.tvKind)
    val petAge = view.findViewById<TextView>(R.id.tvAge)
    val petPhoto = view.findViewById<ImageView>(R.id.ivPet)

    fun renderPets(petModelo: Pet){
        petName.text = petModelo.name
        petKind.text = petModelo.kind
        petAge.text = petModelo.age.toString()
        Glide.with(petPhoto.context).load(petModelo.photo).into(petPhoto)

        petPhoto.setOnClickListener{
            Toast.makeText(petPhoto.context,petModelo.name, Toast.LENGTH_SHORT ).show()
        }

    }
}