package com.example.wowcharacterselector

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.cancel
import com.example.wowcharacterselector.R
import com.example.wowcharacterselector.databinding.FragmentMainBinding

class MainMenu : Fragment(){
    private lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
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
        selectionByClass.setOnClickListener{
            navigateToByClass()
        }
    }

    fun navigateToByClass(){
        val directions = MainMenuDirections.actionTaskFragmentToEditTaskFragment()
        findNavController().navigate(directions)
    }

    fun setupObservers(){ }
}