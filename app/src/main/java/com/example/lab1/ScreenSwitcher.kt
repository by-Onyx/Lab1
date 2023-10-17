package com.example.lab1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab1.databinding.ScreenSwitchBinding

class ScreenSwitcher : Fragment() {

    private var binding: ScreenSwitchBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ScreenSwitchBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    private fun selectScreen(itemId: Int) {
        val transaction = childFragmentManager.beginTransaction()
        when(itemId) {

        }
        transaction.commit()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ScreenSwitcher()
    }
}