package com.example.tugaschapter3topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.synthetic.main.activity_parcelable.*

class Parcelable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        var data = intent.getParcelableExtra("dataBMI") as DataParcel?
        txtParcel.text = data?.kondisi
    }
}