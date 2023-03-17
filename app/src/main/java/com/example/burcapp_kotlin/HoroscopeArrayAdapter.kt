package com.example.burcapp_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.horoscope_line.view.*

class HoroscopeArrayAdapter(
    var gelencontext: Context,
    resource: Int,
    textViewResourceId: Int,
    var horoscope: Array<String>,
    var date:Array<String>,
    var image:Array<Int>,
) : ArrayAdapter<String>(gelencontext, resource, textViewResourceId, horoscope) {

    //getView:satırlar oluşmadan tetikleniyor
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var inflater = LayoutInflater.from(gelencontext)
        var horoscope_line = inflater.inflate(R.layout.horoscope_line,parent,false)

        var horoscope2 = horoscope_line.tvHoroscope
        var date2 = horoscope_line.tvDate
        var image2 = horoscope_line.imageView

        horoscope2.setText(horoscope[position])
        date2.setText(date[position])
        image2.setImageResource(image[position])


        return horoscope_line
    }
}