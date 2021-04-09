package com.example.samplelocalrecyclercard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.samplelocalrecyclercard.`object`.SampleObject
import com.example.samplelocalrecyclercard.adapter.SampleAdapter
import com.example.samplelocalrecyclercard.databinding.ActivityMainBinding
import com.example.samplelocalrecyclercard.modal.Sheets
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    //
    private lateinit var binding: ActivityMainBinding

    //
    private var listSheets: ArrayList<Sheets> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        listSheets.addAll(SampleObject.dataList)

        //
        showCardRecycler()
    }

    private fun showCardRecycler()
    {
        sample_recycler.layoutManager = LinearLayoutManager(this)
        sample_recycler.adapter = SampleAdapter(listSheets)
    }
}