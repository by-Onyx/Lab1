package com.example.lab1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val adapter by lazy { CardAdapter {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentHost.id, CurrentProductPageFragment("haha"))
            .commit()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvContent.adapter = adapter
        val cards = DataGenerator.getCards()
        adapter.submitList(cards)

        /*val adapter = CardAdapter {
            supportFragmentManager.beginTransaction()
                .replace(binding.rvContent.id, CurrentProductPageFragment.newInstance())
                .commit()
        }
        val recyclerView: RecyclerView = findViewById(R.id.rvContent)
        recyclerView.setHasFixedSize(true);
        recyclerView.adapter = adapter
        adapter.submitList(cards)*/
    }
}

