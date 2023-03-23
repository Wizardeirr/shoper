package com.volkankelleci.shoperapp

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.volkankelleci.shoperapp.databinding.FragmentHomeBinding


class HomeFragment : BaseVBFragment<FragmentHomeBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addButton.setOnClickListener {
            val action=HomeFragmentDirections.actionHomeFragmentToHistoryFragment()
            findNavController().navigate(action)
        }
    }

    override fun getViewBinding(): FragmentHomeBinding {
       return FragmentHomeBinding.inflate(layoutInflater)

    }
}