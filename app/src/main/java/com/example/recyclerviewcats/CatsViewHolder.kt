package com.example.recyclerviewcats

import android.annotation.SuppressLint
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewcats.databinding.ItemcatsBinding

class CatsViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val b = ItemcatsBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun render(CatsModel: Cats){
        b.tvName.text = "Name: "+ CatsModel.name
        b.tvRaza.text = "Raza: "+ CatsModel.raza
        b.tvEdad.text = "Edad: "+ CatsModel.edad.toString() + " Años"


        b.tvSexo.text = if (CatsModel.sexo){
            "Sexo: "+"Masculino"
        }
        else{
            "Sexo: "+"Femenino"
        }


        if (CatsModel.chip == true){
            b.tvChip.text = "Chip: "+"Si"
        }
        else{
            b.tvChip.text = "Chip: "+"No"

        }
        if (CatsModel.esterilizado == true){
            b.tvEsterilizado.text = "Esterilizado: "+"Si"
        }
        else{
            b.tvEsterilizado.text = "Esterilizado: "+"No"

        }

        Glide.with(b.ivCat.context)
            .load(CatsModel.photo)
            .error(CatsModel.photo)
            .into(b.ivCat)
        b.ivCat.setOnClickListener {
            Toast.makeText(b.ivCat.context, CatsModel.raza,Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(b.ivCat.context, CatsModel.name,Toast.LENGTH_SHORT).show()
        }
    }
}