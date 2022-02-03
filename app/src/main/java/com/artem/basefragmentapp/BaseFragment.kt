package com.artem.basefragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<B:ViewBinding>:Fragment() {

    private var _binding: B? = null
    private val binding get() = _binding!!


    protected abstract fun initBinding(inflater:LayoutInflater,container: ViewGroup?):View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =initBinding(inflater, container)


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}


