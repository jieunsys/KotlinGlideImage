package com.example.kotlinglideimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idButton1.setOnClickListener {
            Glide.with(this).load("https://i.mydramalist.com/LwVmxc.jpg").into(idImageView1)
        }
    }
}