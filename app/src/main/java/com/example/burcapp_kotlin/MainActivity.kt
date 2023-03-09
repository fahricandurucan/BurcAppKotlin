package com.example.burcapp_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var horoscope = arrayOf("Koç","Boğa","İkizler","Yengeç","Aslan","Başak","Terazi","Akrep","Yay","Oğlak","Kova","Balık")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter: veri kaynağından aldığı bilgiyi view a dönüştüren yapıdır.
        var arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,horoscope) //burçları sırasıyla textview a koyacak

        horoscopeList.adapter = arrayAdapter


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
        horoscopeList.setOnItemClickListener { adapterView, view, i, l ->
            var gecici = view as TextView
            Toast.makeText(this@MainActivity,"Tıklanıldı"+gecici.text.toString(),Toast.LENGTH_SHORT).show()

        }
    }
}