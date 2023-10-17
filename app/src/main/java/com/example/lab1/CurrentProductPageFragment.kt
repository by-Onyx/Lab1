package com.example.lab1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.fragment.app.Fragment
import com.example.lab1.databinding.CurrentProductPageBinding
import com.google.android.material.materialswitch.MaterialSwitch

class CurrentProductPageFragment(private val buttonText: String) : Fragment() {

    private var binding: CurrentProductPageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CurrentProductPageBinding.inflate(inflater, container, false)
        val view = binding?.root

        binding?.textId?.text = buttonText

        val descriptionLayout = binding?.descriptionLayout
        val colorSwitch = binding?.colorSwitch

        switchColor(descriptionLayout, colorSwitch)

        return view
    }

    private fun switchColor(
        descriptionLayout: LinearLayout?,
        colorSwitch: MaterialSwitch?
    ) {
        descriptionLayout?.setBackgroundColor(
            getColor(
                requireContext(),
                R.color.switch_disabled_color
            )
        )

        colorSwitch?.setOnCheckedChangeListener { _, isChecked ->
            val newColor = if (isChecked) {
                getColor(
                    requireContext(),
                    R.color.switch_enabled_color
                )
            } else {
                getColor(
                    requireContext(),
                    R.color.switch_disabled_color
                )
            }
            descriptionLayout?.setBackgroundColor(newColor)
        }
    }
}