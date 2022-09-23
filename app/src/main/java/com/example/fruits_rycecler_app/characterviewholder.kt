package com.example.fruits_rycecler_app

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class characterviewholder(itemView: View) :RecyclerView.ViewHolder(itemView) {

    private val CharName :TextView
    private val CharImage :ImageView

    init{

        CharName=itemView.findViewById(R.id.character_text)
        CharImage=itemView.findViewById(R.id.character_image)


    }

    fun bind(character: character)
    {
        CharName.text= character.charactername
        CharImage.setImageResource(character.characterimage)


    }



}