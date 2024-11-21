package com.example.android_task2

import CapitalAdapter
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val capitals = listOf(
            Capital("Москва", "Столица России"),
            Capital("Минск", "Столица Белорусии"),
            Capital("Ереван", "Столица Армении"),
            Capital("Токио", "Столица Японии"),
            Capital("Пекин", "Столица Китая"),
            Capital("Будапешт", "Столица Венгрии"),
            Capital("Братислава", "Столица Словакии"),
            Capital("Бразилиа", "Столица Бразилии"),
            Capital("Рим", "Столица Италии")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CapitalAdapter(capitals) { capital ->
            Toast.makeText(this, "Описание: ${capital.description}", Toast.LENGTH_SHORT).show()
        }
    }
}