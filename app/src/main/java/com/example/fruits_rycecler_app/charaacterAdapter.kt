package com.example.fruits_rycecler_app

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class charaacterAdapter (private val characterslist:List<character>) :RecyclerView.Adapter<characterviewholder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): characterviewholder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: characterviewholder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {

        characterslist.size
    }


}
