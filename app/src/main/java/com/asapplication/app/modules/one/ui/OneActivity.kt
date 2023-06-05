/*
package com.asapplication.app.modules.one.ui

import android.view.View
import androidx.activity.viewModels
import com.asapplication.app.R
import com.asapplication.app.appcomponents.base.BaseActivity
import com.asapplication.app.databinding.ActivityOneBinding
import com.asapplication.app.modules.one.`data`.model.LightRowModel
import com.asapplication.app.modules.one.`data`.viewmodel.OneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OneActivity : BaseActivity<ActivityOneBinding>(R.layout.activity_one) {
  private val viewModel: OneVM by viewModels<OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val lightAdapter = LightAdapter(viewModel.lightList.value?:mutableListOf())
    binding.recyclerLight.adapter = lightAdapter
    lightAdapter.setOnItemClickListener(
    object : LightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LightRowModel) {
        onClickRecyclerLight(view, position, item)
      }
    }
    )
    viewModel.lightList.observe(this) {
      lightAdapter.updateData(it)
    }
    binding.oneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerLight(
    view: View,
    position: Int,
    item: LightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ONE_ACTIVITY"

  }
}
*/