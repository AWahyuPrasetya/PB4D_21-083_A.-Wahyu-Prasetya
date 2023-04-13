package com.example.modul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val universitasList = listOf<universitas>(
            universitas(
                R.drawable.utm,
                nameuniversitas = "utm",
                descuniversitas = "blablabla"
            ),
            universitas(
                R.drawable.unair,
                nameuniversitas = "unair",
                descuniversitas = "bliblibli"
            ),
            universitas(
                R.drawable.ugm,
                nameuniversitas = "ugm",
                descuniversitas = "blublublu"
            ),
            universitas(
                R.drawable.its,
                nameuniversitas = "its",
                descuniversitas = "blebleble"
            ),
            universitas(
                R.drawable.unesa,
                nameuniversitas = "unesa",
                descuniversitas = "blobloblo"
        )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.universitas)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = UniversitasAdapter(this, universitasList){
            val intent = Intent (this, detaiActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}