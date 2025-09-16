package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter (private val context: Context, private val items: List<Int>) : BaseAdapter() {
    private val inflater = LayoutInflater.from(context)

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = (convertView as? TextView)
            ?: inflater.inflate(android.R.layout.simple_spinner_item,parent, false) as TextView
        view.text = items[position].toString()
        return view
    }

}