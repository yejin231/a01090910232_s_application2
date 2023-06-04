package com.asapplication.app.modules.one.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asapplication.app.R
import com.asapplication.app.databinding.RowLightBinding
import com.asapplication.app.modules.one.`data`.model.LightRowModel
import kotlin.Int
import kotlin.collections.List

class LightAdapter(
  var list: List<LightRowModel>
) : RecyclerView.Adapter<LightAdapter.RowLightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLightVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_light,parent,false)
    return RowLightVH(view)
  }

  override fun onBindViewHolder(holder: RowLightVH, position: Int) {
    val lightRowModel = LightRowModel()
    // TODO uncomment following line after integration with data source
    // val lightRowModel = list[position]
    holder.binding.lightRowModel = lightRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LightRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: LightRowModel
    ) {
    }
  }

  inner class RowLightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLightBinding = RowLightBinding.bind(itemView)
  }
}
