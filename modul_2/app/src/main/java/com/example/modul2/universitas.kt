package com.example.modul2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class universitas(
    val imguniversitas: Int,
    val nameuniversitas: String,
    val descuniversitas: String
) : Parcelable
