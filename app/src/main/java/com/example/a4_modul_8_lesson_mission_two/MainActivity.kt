 package com.example.a4_modul_8_lesson_mission_two

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_text_view.*
import java.util.*

 class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        cv_one.setOnClickListener{
            val intent = Intent(this,TextView::class.java)
            intent.putExtra("doniyor","156 mln dollar suvda oqib ketaveradimi? - Angrendagi shina zavodi faoliyati tanqidga uchradi")
            intent.putExtra("artikov",R.drawable.birinchi)
            startActivity(intent)
        }


        cv_two.setOnClickListener{
            val intent = Intent(this,TextView::class.java)
            intent.putExtra("doniyor","O‘zbekistonda Ramazon oyi 13 aprelda boshlanadi")
            intent.putExtra("artikov",R.drawable.ikkinchi)
            startActivity(intent)
        }

        cv_third.setOnClickListener{
            val intent = Intent(this,TextView::class.java)
            intent.putExtra("doniyor","O‘zbekistonda farmatsevtika sohasini rivojlantirishga qaratilgan memorandum imzolandi")
            intent.putExtra("artikov",R.drawable.tortinchi)
            startActivity(intent)
        }

        cv_four.setOnClickListener{
            val intent = Intent(this,TextView::class.java)
           intent.putExtra("doniyor","Yangi ChoshTepa turar joy majmuasidan tayyor ta'mirlangan xonadonlar")
            intent.putExtra("artikov",R.drawable.uchinchi)
            startActivity(intent)
        }

        cv_five.setOnClickListener{
            val intent = Intent(this,TextView::class.java)
            intent.putExtra("doniyor","Yangi sovuq urush bo‘lmaydi. AQSh-Xitoy raqobati chegaralari")
            intent.putExtra("artikov",R.drawable.beshinchi)
            startActivity(intent)
        }

        if ((Calendar.getInstance().get(Calendar.MINUTE)) < 10){
            tv_1_1.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + "0" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }else{
            tv_1_1.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }
        tv_1.text =  Uri.parse("156 mln dollar suvda oqib ketaveradimi angrendagi shina zavodi faoliyati tanqidga uchradi").toString()

        if ((Calendar.getInstance().get(Calendar.MINUTE)) < 10){
            tv_2_2.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + "0" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }else{
            tv_2_2.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }
        tv_2.text =  Uri.parse("O‘zbekistonda Ramazon oyi 13 aprelda boshlanadi").toString()

        if ((Calendar.getInstance().get(Calendar.MINUTE)) < 10){
            tv_3_3.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + "0" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }else{
            tv_3_3.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }
        tv_3.text =  Uri.parse("O‘zbekistonda farmatsevtika sohasini rivojlantirishga qaratilgan memorandum imzolandi").toString()

        if ((Calendar.getInstance().get(Calendar.MINUTE)) < 10){
            tv_4_4.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + "0" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }else{
            tv_4_4.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }
        tv_4.text =  Uri.parse("Yangi ChoshTepa turar joy majmuasidan tayyor ta'mirlangan xonadonlar").toString()

        if ((Calendar.getInstance().get(Calendar.MINUTE)) < 10){
            tv_5_5.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + "0" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }else{
            tv_5_5.text = (Calendar.getInstance().get(Calendar.YEAR)).toString() + "-" + (Calendar.getInstance().get(Calendar.MONTH)).toString() + "-" + (Calendar.getInstance().get(Calendar.DAY_OF_MONTH)).toString() + "|" + (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)).toString() + ":" + (Calendar.getInstance().get(Calendar.MINUTE)).toString()
        }
        tv_5.text =  Uri.parse("Yangi sovuq urush bo‘lmaydi. AQSh-Xitoy raqobati chegaralari").toString()

    }
}