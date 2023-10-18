package com.example.lab1

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val adapter by lazy {
        CardAdapter(
            onItemClick = { card, cardId ->
                supportFragmentManager.beginTransaction()
                    .replace(binding.fragmentHost.id, CurrentProductPageFragment(buttonText = cardId))
                    .addToBackStack(null)
                    .commit()
            }
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val cards = DataGenerator.getCards()
        adapter.submitList(cards)

        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentHost.id, MainPage(adapter))
            .commit()
    }


}

