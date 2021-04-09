package com.example.samplelocalrecyclercard.`object`

import com.example.samplelocalrecyclercard.R
import com.example.samplelocalrecyclercard.modal.Sheets

object SampleObject
{
    private val sample_image = intArrayOf(
        R.drawable.first,
        R.drawable.second,
        R.drawable.third,
        R.drawable.fourth,
        R.drawable.fifth,
        R.drawable.sixth,
        R.drawable.seventh,
        R.drawable.eight
    )

    private val sample_title = arrayOf(
        "First",
        "Second",
        "Third",
        "Fourth",
        "Fifth",
        "Sixth",
        "Seventh",
        "Eight"
    )

    private val sample_description = arrayOf(
        "Desc First",
        "Desc Second",
        "Desc Third",
        "Desc Fourth",
        "Desc Fifth",
        "Desc Sixth",
        "Desc Seventh",
        "Desc Eight"
    )

    //
    val dataList: ArrayList<Sheets>get() {
        val listData= arrayListOf<Sheets>()

        for (position in sample_title.indices)
        {
            //
            val data = Sheets()

            data.title = sample_title[position]
            data.desc = sample_description[position]
            data.image = sample_image[position]

            listData.add(data)
        }

        return listData
    }
}