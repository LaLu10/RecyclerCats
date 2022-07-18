package com.example.recyclerviewcats

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CatsAdapter (private val catslist: List<Cats>) : RecyclerView.Adapter<CatsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CatsViewHolder(layoutInflater.inflate(R.layout.itemcats, parent, false))
    }
    override fun onBindViewHolder(holder: CatsViewHolder, position: Int) {
        val item = catslist[position]
        holder.render(item)
    }
    override fun getItemCount(): Int = catslist.size
}