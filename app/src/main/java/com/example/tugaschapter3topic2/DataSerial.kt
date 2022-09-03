package com.example.tugaschapter3topic2

import android.widget.TextView
import java.io.Serializable

data class DataSerial(var umur: Int = 0, var tb: Double = 0.0, var bb: Double = 0.0, var hasil: Double = 0.0, var kondisi: String) : Serializable