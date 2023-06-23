package com.example.hackatonkuit.ui.order

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemAllmenuCvBinding

class AllmenuAdapter(private val items: ArrayList<AllmenuInfo>) : RecyclerView.Adapter<AllmenuAdapter.ViewHolder>() {


    inner class ViewHolder(val binding: ItemAllmenuCvBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: AllmenuInfo) {
            binding.coffeekorTv.text = item.korname
            binding.coffeeengTv.text = item.engname
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemAllmenuCvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }




}