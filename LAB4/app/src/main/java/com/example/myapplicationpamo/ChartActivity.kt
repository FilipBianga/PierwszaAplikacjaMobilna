package com.example.myapplicationpamo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.activity_chart.*

class ChartActivity : AppCompatActivity() {

    lateinit var barList:ArrayList<BarEntry>
    lateinit var barDataSet: BarDataSet
    lateinit var barData: BarData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        barList= ArrayList()
        barList.add(BarEntry(1f,25.66f))
        barList.add(BarEntry(2f,25.06f))
        barList.add(BarEntry(3f,24.15f))
        barList.add(BarEntry(4f,23.94f))


        barDataSet= BarDataSet(barList,"months")
        barData= BarData(barDataSet)
        barchart.data = barData
        barDataSet.valueTextColor= Color.BLACK
        barDataSet.valueTextSize=10f
    }
}