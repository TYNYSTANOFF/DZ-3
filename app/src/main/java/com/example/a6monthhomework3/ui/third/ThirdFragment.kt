package com.example.a6monthhomework3.ui.third

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.a6monthhomework3.R
import com.example.a6monthhomework3.base.BaseFragment
import com.example.a6monthhomework3.databinding.FragmentFirstBinding
import com.example.a6monthhomework3.databinding.FragmentThirdBinding
import com.example.a6monthhomework3.viewmodel.ProjectViewModel

class ThirdFragment() : BaseFragment<FragmentThirdBinding, ProjectViewModel>(){
    private var adapter :ThirdAdapter? = null

    override val viewModel: ProjectViewModel
            by lazy{
                ViewModelProvider(requireActivity())[ProjectViewModel::class.java]
            }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }



    override fun inflateVB(layoutInflater: LayoutInflater): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(layoutInflater)
    }

    override fun checkInternet() {
        TODO("Not yet implemented")
    }
    override fun initViewModel() {
    }
    override fun initListener() {
        TODO("Not yet implemented")
    }
    override fun initViews() {
        TODO("Not yet implemented")
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycle()
    }

    private fun recycle() {
        adapter = ThirdAdapter()
        viewModel.resultAdapter.observe(viewLifecycleOwner){
            binding.text.text = it
        }

    }


}