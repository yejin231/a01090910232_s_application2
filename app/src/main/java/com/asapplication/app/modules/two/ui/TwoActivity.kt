package com.asapplication.app.modules.two.ui

import android.view.View
import androidx.activity.viewModels
import com.asapplication.app.R
import com.asapplication.app.appcomponents.base.BaseActivity
import com.asapplication.app.databinding.ActivityTwoBinding
import com.asapplication.app.modules.two.`data`.model.TwoRowModel
import com.asapplication.app.modules.two.`data`.viewmodel.TwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TwoActivity : BaseActivity<ActivityTwoBinding>(R.layout.activity_two) {
  private val viewModel: TwoVM by viewModels<TwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val twoAdapter = TwoAdapter(viewModel.twoList.value?:mutableListOf())
    binding.recyclerTwo.adapter = twoAdapter
    twoAdapter.setOnItemClickListener(
    object : TwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TwoRowModel) {
        onClickRecyclerTwo(view, position, item)
      }
    }
    )
    viewModel.twoList.observe(this) {
      twoAdapter.updateData(it)
    }
    binding.twoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTwo(
    view: View,
    position: Int,
    item: TwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TWO_ACTIVITY"

  }
}
