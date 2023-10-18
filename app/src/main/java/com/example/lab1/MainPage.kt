package com.example.lab1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.CurrentProductPageBinding
import com.example.lab1.databinding.MainPageBinding

class MainPage(private val adapter: RecyclerView.Adapter<*>) : Fragment() {

    private var binding: MainPageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainPageBinding.inflate(inflater, container, false)
        val view = binding?.root

        binding?.rvContent?.adapter = adapter

        return view
    }
}