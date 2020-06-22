package com.lrchao.lrcsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.layout_item_main.view.tvTitle

/**
 * Description:
 * @author lrc19860926@gmail.com
 * @date 2020/6/22 4:10 PM
 */
class MainAdapter(private val dataSource: Array<String>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item_main, parent, false)
        return MainViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(dataSource[position])
    }

    class  MainViewHolder(itemView: View) : ViewHolder(itemView) {
        fun bind(s: String) {

            itemView.run {
                tvTitle.text = s
            }
        }
    }
}