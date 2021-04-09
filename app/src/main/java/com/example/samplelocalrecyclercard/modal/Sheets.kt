package com.example.samplelocalrecyclercard.modal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Sheets(
    var image: Int = 0,
    var title: String ="",
    var desc: String = ""
): Parcelable
