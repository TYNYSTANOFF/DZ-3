package com.example.a6monthhomework3.ui.second

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.a6monthhomework3.R
import com.example.a6monthhomework3.base.BaseFragment
import com.example.a6monthhomework3.databinding.FragmentSecondBinding
import com.example.a6monthhomework3.databinding.FragmentThirdBinding
import com.example.a6monthhomework3.ui.third.ThirdAdapter
import com.example.a6monthhomework3.viewmodel.ProjectViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding, ProjectViewModel>() {


    override val viewModel: ProjectViewModel
            by lazy {
                ViewModelProvider(requireActivity())[ProjectViewModel::class.java]
            }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun inflateVB(layoutInflater: LayoutInflater): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
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
        viewModel.result.observe(viewLifecycleOwner){
            binding.tv2Count.text = it.toString()
            Log.e("ololo","result")
        }
    }
}

