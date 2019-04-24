package com.marcos.mvvmkotlin.presentation

import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import com.marcos.mvvmkotlin.model.Pizza

class MainViewModel {

    val pizzas = ObservableArrayList<Pizza>()
    val loadingVisibility = ObservableBoolean(false)
    val message = ObservableField<String>()
}