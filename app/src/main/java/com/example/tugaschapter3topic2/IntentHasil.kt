package com.example.tugaschapter3topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_hasil.*
//UNTUK INTENT BISA LANGSUNG KELUAR HASIL KARENA MENGAMBIL DARI INPUTAN LANGSUNG OUTPUTNYA
//UNTUK BUNDLE, SERIAL, DAN PARCEL SAYA AMBIL DARI INPUTAN BUTTON HITUNG JADI HARUS KLIK BUTTON HITUNG DAHULU
//BARU BISA KELUAR OUTPUTNYA
class IntentHasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_hasil)


        ambilDataIntent()

    }
    fun ambilDataIntent(){
        var umur = intent.getIntExtra("umur",0)
        var tb = intent.getDoubleExtra("tb",0.0)
        var bb = intent.getDoubleExtra("bb",0.0)
        var kondisi = intent.getStringExtra("kondisi")
        var hasilBmi = intent.getDoubleExtra("hasil",0.0)

        txtHasil.text = ("BMI Anda : "+hasilBmi.toString())
        txtUmur.text = ("Umur Anda : "+umur.toString())
        txtTinggi.text = ("Tinggi : "+tb.toInt().toString())
        txtBerat.text = ("Berat Badan : "+bb.toInt().toString())

        if (hasilBmi >= 40){
            txtKondisi.text = "Kategori : Obesitas Kelas III"
        }else if (hasilBmi>=35){
            if (hasilBmi<40){
                txtKondisi.text = "Kategori : Obesitas Kelas II"
            }
        }else if (hasilBmi>=30){
            if (hasilBmi<35){
                txtKondisi.text = "Kategori : Obesitas Kelas II"
            }
        }else if (hasilBmi>=25){
            if (hasilBmi<30){
                txtKondisi.text = "Kategori : Gemuk"
            }
        }else if (hasilBmi>=18.5){
            if (hasilBmi<25){
                txtKondisi.text = "Kategori : Normal"
            }
        }else if (hasilBmi>=17){
            if (hasilBmi<18.5){
                txtKondisi.text = "Kategori : Sedikit Kurus"
            }
        }else if (hasilBmi>=16){
            if (hasilBmi<17){
                txtKondisi.text = "Kategori : Cukup Kurus"
            }
        }else if (hasilBmi>=0){
            if (hasilBmi<16){
                txtKondisi.text = "Kategori : Terlalu Kurus"
            }
        }

    }

}