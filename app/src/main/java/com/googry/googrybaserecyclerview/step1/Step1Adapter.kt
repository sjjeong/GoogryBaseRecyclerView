package com.googry.googrybaserecyclerview.step1

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.googry.googrybaserecyclerview.LanguageCode
import com.googry.googrybaserecyclerview.R
import kotlinx.android.synthetic.main.language_code_item.view.*

class Step1Adapter : RecyclerView.Adapter<Step1Adapter.ViewHolder>() {

    private val items = mutableListOf<LanguageCode>()

    fun replaceAll(newItems: List<LanguageCode>?) {
        newItems?.let {
            items.clear()
            items.addAll(it)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent)

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBindViewHolder(items[position])
    }

    inner class ViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.language_code_item, parent, false)
    ) {

        fun onBindViewHolder(item: LanguageCode) {
            with(itemView) {
                tvCode.text = item.code
                tvLanguage.text = item.language
            }
        }
    }


}