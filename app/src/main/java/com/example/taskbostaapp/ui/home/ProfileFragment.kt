package com.example.taskbostaapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.taskbostaapp.R
import com.example.taskbostaapp.api.InternetConnection
import com.example.taskbostaapp.databinding.FragmentProfileBinding
import com.example.taskbostaapp.model.AlbumsResponse


class ProfileFragment : Fragment(), AlbumAdapter.OnItemClickListener {
    private lateinit var binding: FragmentProfileBinding
    private lateinit var albumsList: ArrayList<AlbumsResponse>
    private lateinit var albumsAdapter: AlbumAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        albumsList = ArrayList()
        albumsAdapter = AlbumAdapter(albumsList, this@ProfileFragment)

        binding.albumRec.layoutManager = LinearLayoutManager(requireContext())
        binding.albumRec.setHasFixedSize(true)

        binding.albumRec.adapter = albumsAdapter


    }
    private fun fetchData() {

        if (InternetConnection.isInternetConnected(requireContext())) {


            val viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]
            viewModel.getHome().observe(requireActivity()) {
               binding.name.text= it.body()?.get(0)?.name.toString()
               binding.address.text= "${it.body()?.get(0)?.address?.street.toString()},${it.body()?.get(0)?.address?.suite.toString()},${it.body()?.get(0)?.address?.city.toString()},\n ${it.body()?.get(0)?.address?.zipcode.toString()},"
            }

            //   CurrentTime()
        } else {


        }

    }
//    private fun fetchData() {
//
//        if (InternetConnection.isInternetConnected(requireContext())) {
//
//
//            val viewModel = ViewModelProvider(this)[ProfileViewModel::class.java]
//            viewModel.getHome().observe(requireActivity()) {
//                albumsList.clear()
//                albumsList.addAll(it.body()!!)
//
//                albumsAdapter.notifyDataSetChanged()
//            }
//
//            //   CurrentTime()
//        } else {
//
//
//        }
//
//    }

    override fun onItemClick(position: Int, item: AlbumsResponse) {

    }


}