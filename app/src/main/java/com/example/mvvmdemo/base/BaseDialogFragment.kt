package com.example.mvvmdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment

abstract class BaseDialogFragment : AppCompatDialogFragment() {
    private var mView: View? = null

    abstract val layoutId: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mView = inflater.inflate(layoutId, container, false)
        initView(mView)
        return mView!!
    }

    abstract fun initView(view: View?)
}