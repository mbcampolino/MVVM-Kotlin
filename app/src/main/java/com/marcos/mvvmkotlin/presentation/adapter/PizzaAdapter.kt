package com.marcos.mvvmkotlin.presentation.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.marcos.mvvmkotlin.databinding.ItemViewBinding
import com.marcos.mvvmkotlin.model.Pizza

class PizzaAdapter(var items : List<Pizza>) : RecyclerView.Adapter<PizzaAdapter.ViewHolder>(), AdapterContract {

    override fun replaceItems(list: List<*>) {
        this.items = list as List<Pizza>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val bind : ItemViewBinding = ItemViewBinding.inflate(inflater, parent, false)
        return ViewHolder(bind)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(items[position])
    }

    class ViewHolder(private val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pizza: Pizza) {
            binding.pizza = pizza
            binding.executePendingBindings()
        }
    }
}