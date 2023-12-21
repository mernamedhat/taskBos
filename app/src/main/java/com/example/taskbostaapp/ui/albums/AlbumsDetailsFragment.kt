package com.example.taskbostaapp.ui.albums

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.taskbostaapp.R
import com.example.taskbostaapp.databinding.FragmentAlbumsDetailsBinding
import com.example.taskbostaapp.databinding.FragmentProfileBinding


class AlbumsDetailsFragment : Fragment() {
    private lateinit var binding: FragmentAlbumsDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlbumsDetailsBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }


}