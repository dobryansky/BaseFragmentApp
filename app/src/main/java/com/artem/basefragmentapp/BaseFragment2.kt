package com.artem.basefragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment2<B: ViewBinding,VM: ViewModel>:Fragment() {


    private var _binding: B? = null
    val binding get() = _binding!!
    protected lateinit var viewModel: VM
    protected abstract fun initBinding(inflater:LayoutInflater,container: ViewGroup?):B

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= initBinding(inflater, container)
        viewModel=ViewModelProvider(this).get(getViewModel())
        return binding.root
    }

abstract fun getViewModel():Class<VM>

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }

}