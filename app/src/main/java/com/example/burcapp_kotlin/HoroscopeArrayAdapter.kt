package com.example.burcapp_kotlin

import android.content.Context
import android.widget.ArrayAdapter

class HoroscopeArrayAdapter(
    context: Context,
    resource: Int,
    textViewResourceId: Int,
    horoscope: Array<String>,
    date:Array<String>,
) : ArrayAdapter<String>(context, resource, textViewResourceId, horoscope) {
}