package com.example.a6monthhomework3.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>  : Fragment(){
    protected lateinit var binding: VB
    protected abstract val viewModel :VM

    protected abstract fun inflateVB(layoutInflater: LayoutInflater):VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        binding = inflateVB(layoutInflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        super.onViewCreated(view, savedInstanceState)

        checkInternet()
        initViews()
        initViewModel()
        initListener()
    }

    fun getBundle(key:String){
        val bundle=Bundle()
        bundle.getStringArrayList(key)
    }

    abstract fun checkInternet()
    abstract fun initViewModel()
    abstract fun initListener()
    abstract fun initViews()
}