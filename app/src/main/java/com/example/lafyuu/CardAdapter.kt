package com.example.lafyuu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(private val cardItemList: List<CardItem>, private val onItemClick: () -> Unit) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = cardItemList[position]
        holder.itemImage.setImageResource(item.imageResource)
        holder.itemTitle.text = item.title
        holder.itemRating.setImageResource(item.ratingResource)
        holder.itemPrice.text = item.price
        holder.itemOriginalPrice.text = item.originalPrice
        holder.itemDiscount.text = item.discount

        holder.itemView.setOnClickListener {
            onItemClick.invoke()
        }
    }

    override fun getItemCount(): Int {
        return cardItemList.size
    }

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.item_image)
        val itemTitle: TextView = itemView.findViewById(R.id.item_title)
        val itemRating: ImageView = itemView.findViewById(R.id.item_rating)
        val itemPrice: TextView = itemView.findViewById(R.id.item_price)
        val itemOriginalPrice: TextView = itemView.findViewById(R.id.item_original_price)
        val itemDiscount: TextView = itemView.findViewById(R.id.item_discount)
    }
}
