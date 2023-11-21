package com.pg.crm

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.delphiccode.R

class Adapetr(context: Context, val itenlist: List<String>) : BaseAdapter() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return itenlist.size
    }

    override fun getItem(position: Int): Any {
       return itenlist[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder
        //if(convertView==null) {
            view = inflater.inflate(R.layout.item_value, parent, false)
            viewHolder = ViewHolder()
            viewHolder.textview = view.findViewById(R.id.text)
        viewHolder.textview.text = itenlist.get(position)

       // }
        return view
    }

    private class ViewHolder {
        lateinit var textview: TextView
    }

}