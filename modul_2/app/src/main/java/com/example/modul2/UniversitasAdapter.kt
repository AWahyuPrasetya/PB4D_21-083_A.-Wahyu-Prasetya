package com.example.modul2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UniversitasAdapter(private val context: Context, private val universitas: List<universitas>, val listener: (universitas) -> Unit)
    : RecyclerView.Adapter<UniversitasAdapter.universitasViewHolder>(){

    class universitasViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imguniversitas = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameuniversitas = view.findViewById<TextView>(R.id.tv_item_name)
        val descuniversitas = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindView(universitas: universitas,listener: (universitas) -> Unit) {
            imguniversitas.setImageResource(universitas.imguniversitas)
            nameuniversitas.text = universitas.nameuniversitas
            descuniversitas.text = universitas.descuniversitas
            itemView.setOnClickListener{
                listener(universitas)}

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): universitasViewHolder {
        return universitasViewHolder(
            LayoutInflater.from(context).inflate(R.layout.universitas, parent, false)
        )
    }

    override fun onBindViewHolder(holder: universitasViewHolder, position: Int) {
        holder.bindView(universitas[position],listener)
    }

    override fun getItemCount(): Int = universitas.size
    }


