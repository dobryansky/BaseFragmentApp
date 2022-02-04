package com.artem.basefragmentapp.page_details

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.artem.basefragmentapp.BaseFragment
import com.artem.basefragmentapp.R
import com.artem.basefragmentapp.databinding.DetailsFragmentBinding

class DetailsFragment : BaseFragment<DetailsFragmentBinding>() {


    companion object {
        fun newInstance() = DetailsFragment()
    }
    private lateinit var viewModel: DetailsViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)
        binding.btnDetailsFragment.setOnClickListener {
            Toast.makeText(requireContext(), "Click Details", Toast.LENGTH_SHORT).show()
        }

    }

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): DetailsFragmentBinding = DetailsFragmentBinding.inflate(inflater, container, false)


}