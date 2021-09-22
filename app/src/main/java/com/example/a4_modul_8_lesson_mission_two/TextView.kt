package com.example.a4_modul_8_lesson_mission_two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_view.*

class TextView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        tView.text = (intent.getStringExtra("doniyor"))
        iView.setImageResource(intent.getIntExtra("artikov",0))

    }

}