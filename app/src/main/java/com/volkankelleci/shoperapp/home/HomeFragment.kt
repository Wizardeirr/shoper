package com.volkankelleci.shoperapp.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.volkankelleci.shoperapp.databinding.FragmentHomeBinding
import com.volkankelleci.shoperapp.room.Shopping
import com.volkankelleci.shoperapp.util.BaseVBFragment
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class HomeFragment : BaseVBFragment<FragmentHomeBinding>() {

    //    val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    var shops = ArrayList<Shopping>()
    //val adapter= HomeAdapter(shops,viewModel)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerItem.layoutManager=LinearLayoutManager(requireContext())
        //binding.recyclerItem.adapter=adapter

        binding.addButton.setOnClickListener{
            val name=binding.enterItem.text.toString()
            val amount=binding.amount.text.toString()
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
            val current = LocalDateTime.now().format(formatter)
            if (name.isEmpty()){
                Toast.makeText(requireContext(), "Please Fill Item", Toast.LENGTH_SHORT).show()

            }else{

            }

        }

    }

    override fun getViewBinding(): FragmentHomeBinding {

       return FragmentHomeBinding.inflate(layoutInflater)


    }

}