package com.example.samplelocalrecyclercard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.samplelocalrecyclercard.R
import com.example.samplelocalrecyclercard.modal.Sheets

class SampleAdapter(private val dataSheets: ArrayList<Sheets>): RecyclerView.Adapter<SampleAdapter.SampleHolder>()
{
    inner class SampleHolder(view: View): RecyclerView.ViewHolder(view)
    {
        var imageSample: ImageView = view.findViewById(R.id.item_card)
        var titleSample: TextView = view.findViewById(R.id.title_card)
        var descSample: TextView = view.findViewById(R.id.desc_card)
        var shareSample: AppCompatButton = view.findViewById(R.id.share_card)
        var favoriteSample: AppCompatButton = view.findViewById(R.id.favorite_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleHolder
    {
        val layoutInflater = LayoutInflater.from(parent.context)
        val inflaterView = layoutInflater.inflate(R.layout.item_list, parent, false)

        return SampleHolder(inflaterView)
    }

    override fun onBindViewHolder(holder: SampleHolder, position: Int)
    {
        val data = dataSheets[position]

        Glide.with(holder.itemView.context)
            .load(data.image)
            .into(holder.imageSample)

        holder.titleSample.text = data.title
        holder.descSample.text = data.desc
        holder.shareSample.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share ${data.title}", Toast.LENGTH_SHORT).show()
        }
        holder.favoriteSample.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Favorite ${data.title}", Toast.LENGTH_SHORT).show()
        }

        //
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Choose ${data.title}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int
    {
        return dataSheets.size
    }

}