package com.example.burcapp_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var horoscope = resources.getStringArray(R.array.horoscope)
        var date = resources.getStringArray(R.array.date)

//        var adapter = ArrayAdapter<String>(this, R.layout.horoscope_line,R.id.tvHoroscope,horoscope)
        var myAdapter = HoroscopeArrayAdapter(this,R.layout.horoscope_line,R.id.tvHoroscope,horoscope,date)
        horoscopeList.adapter = myAdapter

        //adapter: veri kaynağından aldığı bilgiyi view a dönüştüren yapıdır.
        //var arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,horoscope) //burçları sırasıyla textview a koyacak
//        var arrayAdapter = ArrayAdapter<String>(this,R.layout.horoscope_line,R.id.horoscopeName,horoscope)
//
//        horoscopeList.adapter = arrayAdapter


        //tıklama özelliği:zor olan
//        horoscopeList.setOnItemClickListener(object : AdapterView.OnItemClickListener{
//            override fun onItemClick(p0: AdapterView<*>?, view: View?, p2: Int, p3: Long) {
//                var gecici = view as TextView
//                Toast.makeText(this@MainActivity,"Tıklanıldı"+gecici.text.toString(),Toast.LENGTH_SHORT).show()
//
//            }
//
//        })

        // tılama özelliği2:basit olan
//        horoscopeList.setOnItemClickListener { adapterView, view, i, l ->
//            var gecici = view as TextView
//            Toast.makeText(this@MainActivity,"Tıklanıldı"+gecici.text.toString(),Toast.LENGTH_SHORT).show()
//
//        }
    }
}