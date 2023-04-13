package com.example.modul2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detaiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detai)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val universitas = intent.getParcelableExtra<universitas>(MainActivity.INTENT_PARCELABLE)


        val imguniversitas = findViewById<ImageView>(R.id.img_item_photo)
        val nameuniversitas= findViewById<TextView>(R.id.tv_item_name)
        val descuniversitas = findViewById<TextView>(R.id.tv_item_description)

        imguniversitas.setImageResource(universitas?.imguniversitas!!)
        nameuniversitas.text = universitas.nameuniversitas
        descuniversitas.text = universitas.descuniversitas

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}