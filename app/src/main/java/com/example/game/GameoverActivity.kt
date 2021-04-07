package com.example.game;

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.game.databinding.ActivityGameoverBinding

class GameoverActivity : AppCompatActivity() {

private lateinit var binding: ActivityGameoverBinding

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityGameoverBinding.inflate(layoutInflater)
                val view = binding.root

                Log.d("score",intent.getStringExtra("score").toString())
                binding.scoreNum.text=intent.getStringExtra("score").toString()
                setContentView(view)

        }



}
