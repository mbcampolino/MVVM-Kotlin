package com.marcos.mvvmkotlin.presentation.adapter

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView

class BindingAdapter {

    companion object {

        @BindingAdapter("items")
        @JvmStatic
        fun setItems(recyclerView: RecyclerView, list: List<Any>) {
            recyclerView.adapter.let {
                if(it is AdapterContract) {
                    it.replaceItems(list)
                }
            }
        }
    }

}