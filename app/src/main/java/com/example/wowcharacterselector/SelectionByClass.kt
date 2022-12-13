package com.example.wowcharacterselector

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wowcharacterselector.databinding.FragmentSelectionByClassBinding

class SelectionByClass : Fragment() {
    private lateinit var binding: FragmentSelectionByClassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentSelectionByClassBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupListeners()
        setupObservers()
        return binding.root
    }

    fun setupListeners() = with(binding){  }

    fun setupObservers(){ }
}