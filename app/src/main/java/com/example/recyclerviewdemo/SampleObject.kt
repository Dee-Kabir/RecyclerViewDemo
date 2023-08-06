package com.example.recyclerviewdemo

object SampleObject {
    fun getSampleData(): List<SampleData>{
        val listItems : MutableList<SampleData> = mutableListOf()
        listItems.add(SampleData("Apple",100))
        listItems.add(SampleData("Orange",200))
        listItems.add(SampleData("Grapes",300))
        listItems.add(SampleData("Banana",400))
        listItems.add(SampleData("Papaya",500))
        return listItems
    }
}