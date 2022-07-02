package dev.pinky.recyclerviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NamesRecyclerViewAdapter (var numbersList: List<Int>):
    RecyclerView.Adapter <NumbersViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context) // inflating this xml  into a view
            .inflate(R.layout.fibonacci_numbers_list,parent,false)
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvNumber.text = numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return  numbersList.size
    }
}

class NumbersViewHolder (itemView:View):RecyclerView.ViewHolder(itemView) {
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}