package com.example.a6monthhomework3.ui.first

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.a6monthhomework3.viewmodel.ProjectViewModel
import com.example.a6monthhomework3.R
import com.example.a6monthhomework3.base.BaseFragment
import com.example.a6monthhomework3.databinding.FragmentFirstBinding
import com.example.a6monthhomework3.databinding.FragmentSecondBinding


class FirstFragment :BaseFragment<FragmentFirstBinding, ProjectViewModel>() {


    override val viewModel: ProjectViewModel
            by lazy {
                ViewModelProvider(requireActivity())[ProjectViewModel::class.java]
            }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun inflateVB(layoutInflater: LayoutInflater): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(layoutInflater)
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
        click()
        viewModel.result.observe(viewLifecycleOwner){
            binding.tvCount.text = it.toString()
            Log.e("ololo","result")
        }

    }

    private fun click() {

        binding.btnMinus.setOnClickListener {
            viewModel.decrement()
            Log.e("ololo","decrement")

        }
        binding.btnPlus.setOnClickListener {
            viewModel.increment()
            Log.e("ololo","increment")

        }
    }
    }