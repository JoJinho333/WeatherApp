package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { //button을 클릭했을 때(맑음 버튼)
            //텍스트뷰(textView)의 텍스트와 이미지뷰의 이미지를 변경한다.
            textView.text = "맑은 날"
            imageView.setImageResource(R.drawable.sunny01)

        }

        button2.setOnClickListener { //button을 클릭했을 때(흐림 버튼)
            //텍스트뷰(textView)의 텍스트와 이미지뷰의 이미지를 변경한다.
            textView.text = "흐린 날"
            imageView.setImageResource(R.drawable.cloudy02)

        }

        button3.setOnClickListener { //button을 클릭했을 때(비 버튼)
            //텍스트뷰(textView)의 텍스트와 이미지뷰의 이미지를 변경한다.
            textView.text = "비 오는 날"
            imageView.setImageResource(R.drawable.rainy04)
        }
    }
}