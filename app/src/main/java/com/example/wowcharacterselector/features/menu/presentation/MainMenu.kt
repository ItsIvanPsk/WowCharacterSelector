package com.example.wowcharacterselector.features.menu.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.wowcharacterselector.R
import com.example.wowcharacterselector.databinding.FragmentMainMenuBinding


class MainMenu : Fragment(){
    private lateinit var binding: FragmentMainMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainMenuBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setupListeners()
        setupObservers()
        return binding.root
    }

    fun setupListeners() = with(binding){
        selectByClass.setOnClickListener {
            goToSelectionByClass()
        }
    }

    fun setupObservers(){ }

    fun goToSelectionByClass(){
        findNavController().navigate(R.id.action_mainMenu_to_selectionByClass2)
    }

}