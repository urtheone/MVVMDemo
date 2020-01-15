package com.example.mvvmdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.jessyan.autosize.internal.CustomAdapt

abstract class BaseFragment : Fragment(), CustomAdapt {
    private var mRootView: View? = null
    abstract val layoutId: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mRootView = inflater.inflate(layoutId, container, false)
        return mRootView!!
    }
}