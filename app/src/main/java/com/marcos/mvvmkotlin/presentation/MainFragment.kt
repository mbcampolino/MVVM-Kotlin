package com.marcos.mvvmkotlin.presentation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.marcos.mvvmkotlin.databinding.FragmentMainBinding
import com.marcos.mvvmkotlin.model.Pizza
import com.marcos.mvvmkotlin.presentation.adapter.PizzaAdapter

class MainFragment : Fragment() {

    lateinit var viewModel: MainViewModel

    companion object {
        fun newInstance(viewModel: MainViewModel) : MainFragment {
            val fragment = MainFragment()
            fragment.viewModel = viewModel
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentMainBinding = FragmentMainBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.recyclerView.adapter = PizzaAdapter(emptyList())
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
        return binding.root
    }

}
