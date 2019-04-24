package com.marcos.mvvmkotlin.presentation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.marcos.mvvmkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        addFragmentTo(R.id.content_frame, createFragment())
    }

    fun createFragment(): MainFragment {
        return MainFragment.newInstance(createViewModel())
    }

    fun createViewModel(): MainViewModel {
        return MainViewModel()
    }

    fun AppCompatActivity.addFragmentTo(containerId: Int, fragment: Fragment, tag: String = "") {
        supportFragmentManager.beginTransaction().add(containerId, fragment, tag).commit()
    }
}
