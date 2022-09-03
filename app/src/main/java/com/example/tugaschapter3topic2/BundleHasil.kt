package com.example.tugaschapter3topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bundle_hasil.*
import kotlinx.android.synthetic.main.activity_intent_hasil.*
import kotlinx.android.synthetic.main.activity_main.*

class BundleHasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bundle_hasil)
        ambilDataBundle()
    }
    fun ambilDataBundle(){

        var bun =intent.extras

        txtKondisiBundle.setText(bun!!.getString("kondisi"))

    }
}