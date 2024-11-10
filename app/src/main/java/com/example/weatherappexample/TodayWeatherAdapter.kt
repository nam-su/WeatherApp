package com.example.weatherappexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.weatherappexample.databinding.TodayWeatherItemViewBinding

class TodayWeatherAdapter(private val listTodayWeather: ArrayList<TodayWeather>): RecyclerView.Adapter<TodayWeatherAdapter.TodayWeatherViewHolder>(){

    lateinit var binding: TodayWeatherItemViewBinding

    class TodayWeatherViewHolder(private val binding: TodayWeatherItemViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun onBind(weather: TodayWeather) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayWeatherViewHolder {
        binding = TodayWeatherItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return TodayWeatherViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listTodayWeather.size
    }

    override fun onBindViewHolder(holder: TodayWeatherViewHolder, position: Int) {
        holder.onBind(listTodayWeather[position])
    }

}