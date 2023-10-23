package Targarin.com

import Targarin.com.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import view.adapters.MainDailyListAdapter
import view.adapters.MainHourlyListAdapter


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var hourlyList: RecyclerView
    private lateinit var dailyList: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        hourlyList = binding.mainHourlyList
        dailyList = binding.mainDailyList

        initViews()

        hourlyList.apply {
            adapter = MainHourlyListAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
        }

        dailyList.apply {
            adapter = MainDailyListAdapter()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            setHasFixedSize(true)
        }




    }

    private fun initViews()
    {

        binding.mainCityNameTv.text = "Москва"
        binding.mainDataTv.text = "1 апреля"
        binding.mainWeatherConditionIcon.setImageResource(R.drawable.ic_sun)
        binding.mainTemp.text = "25\u00b0"
        binding.mainTempMinTv.text = "19\u00b0"
        binding.mainTempAveTv.text = "23\u00b0"
        binding.mainTempMaxTv.text = "28\u00b0"
        binding.mainWeatherImage.setImageResource(R.mipmap.cloud3x)
        binding.mainPressureMuTv.text = "1023 hPa"
        binding.mainHumidityMuTv.text="96%"
        binding.mainWindSpeedMuTv.text="4 м/c"
        binding.mainSunriseMuTv.text="19:40"
        binding.mainSunsetMuTv.text="6:30"
        binding.mainWeatherConditionDiscription.text=" Солнечно"

    }

}