package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.rvList.layoutManager = LinearLayoutManager(this)
            binding.rvList.adapter = MyRecyclerViewAdapter(SampleObject.getSampleData()){
                item:SampleData -> sampleClickListener(item)
            }

    }

    private fun sampleClickListener(item:SampleData){
        Toast.makeText(this,"passed as a function: price of ${item.name} is ${item.price}",Toast.LENGTH_SHORT).show()
    }
}