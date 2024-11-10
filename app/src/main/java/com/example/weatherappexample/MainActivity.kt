package com.example.weatherappexample

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherappexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "메인액티비티"
    
    lateinit var binding: ActivityMainBinding
    private val listTodayWeather = ArrayList<TodayWeather>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for (i:Int in 0..3) {
            val weather = TodayWeather("a")
            listTodayWeather.add(weather)
        }

        binding.recyclerViewTodayWeather.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewTodayWeather.adapter = TodayWeatherAdapter(listTodayWeather)

        binding.lottieAnimationViewWeather.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator) {
                // 애니메이션 시작할 때
                Log.d(TAG, "onAnimationStart: ")
            }

            override fun onAnimationEnd(animation: Animator) {
                // 애니메이션 끝날 때
                Log.d(TAG, "onAnimationEnd: ")
            }

            override fun onAnimationCancel(animation: Animator) {
                // 애니메이션 취소될 때
                Log.d(TAG, "onAnimationCancel: ")
            }

            override fun onAnimationRepeat(animation: Animator) {
                // 애니메이션 시작 후 반복할 때
                Log.d(TAG, "onAnimationRepeat: ")
            }
        })
    }
}