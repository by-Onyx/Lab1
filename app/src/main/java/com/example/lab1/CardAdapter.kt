package com.example.lab1

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CardAdapter(private val onItemClick: (ContentCards) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val cards = mutableListOf<ContentCards>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.big_contant_card -> {
                BigContentCardViewHolder(parent.inflate(R.layout.big_contant_card))
            }
            R.layout.little_contant_card -> {
                LittleContentCardViewHolder(parent.inflate(R.layout.little_contant_card))
            }
            else -> throw IllegalStateException("Unknown view type $viewType")
        }
    }

    override fun getItemCount(): Int = cards.size

    override fun getItemViewType(position: Int): Int {
        return when (cards[position]) {
            is BigContentCard -> R.layout.big_contant_card
            is LittleContentCard -> R.layout.little_contant_card
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val card = cards[position]
        when (holder) {
            is BigContentCardViewHolder -> {
                holder.bind(card as BigContentCard)
            }
            is LittleContentCardViewHolder -> {
                holder.bind(card as LittleContentCard)
            }
        }

        holder.itemView.setOnClickListener {
            onItemClick(card)
        }
    }

    inner class BigContentCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val headerTextView: TextView = itemView.findViewById(R.id.header)
        private val subheaderTextView: TextView = itemView.findViewById(R.id.subhead)
        private val descriptionTextView: TextView = itemView.findViewById(R.id.description)

        fun bind(item: BigContentCard) {
            headerTextView.text = item.header
            subheaderTextView.text = item.subheader
            descriptionTextView.text = item.description
        }
    }

    inner class LittleContentCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val headerTextView: TextView = itemView.findViewById(R.id.header)
        private val subheaderTextView: TextView = itemView.findViewById(R.id.subhead)

        fun bind(item: LittleContentCard) {
            headerTextView.text = item.header
            subheaderTextView.text = item.subheader
        }
    }

    fun submitList(list: List<ContentCards>) {
        this.cards.addAll(list)
        notifyDataSetChanged()
    }
}