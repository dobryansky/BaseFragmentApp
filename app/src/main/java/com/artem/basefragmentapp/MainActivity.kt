package com.artem.basefragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.artem.basefragmentapp.databinding.ActivityMainBinding
import com.artem.basefragmentapp.page_details.DetailsFragment
import com.artem.basefragmentapp.page_list.ListFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initViews()

    }

    private fun initViews() {
        binding.apply {
            btnDetails.setOnClickListener {
                supportFragmentManager.beginTransaction().add(R.id.container,DetailsFragment.newInstance()).addToBackStack(null).commit()
            }
            btnList.setOnClickListener {
                supportFragmentManager.beginTransaction().add(R.id.container,ListFragment.newInstance()).addToBackStack(null).commit()
            }
        }
    }


}