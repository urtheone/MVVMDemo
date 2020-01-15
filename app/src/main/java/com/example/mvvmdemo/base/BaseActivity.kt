package com.example.mvvmdemo.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.jessyan.autosize.internal.CustomAdapt

abstract class BaseActivity : AppCompatActivity(), CustomAdapt {

    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }
}