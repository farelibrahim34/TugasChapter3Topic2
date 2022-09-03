package com.example.tugaschapter3topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_serializable.*

open class Serializable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)
        var data =intent.getSerializableExtra("databmi") as DataSerial
        txtSerializable.text = data.kondisi
    }
}