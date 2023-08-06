package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val items: List<SampleData>, val onClickFun : (SampleData) -> Unit) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = layoutInflater.inflate(R.layout.recycler_view_list_item,parent,false)

        return MyViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position],onClickFun,position)
    }

}
class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){

    fun bind(item:SampleData, onClickFun: (SampleData) -> Unit,position:Int){
        val tv = view.findViewById<TextView>(R.id.textView)
        tv.text = item.name
        if(position%2 == 0){
            tv.setOnClickListener {
                onClickFun(item)
            }
        }else
        tv.setOnClickListener {
            Toast.makeText(view.context,"Price of ${item.name} is ${item.price}", Toast.LENGTH_LONG).show()
        }

    }
}