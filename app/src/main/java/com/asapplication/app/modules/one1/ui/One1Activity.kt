package com.asapplication.app.modules.one1.ui

import androidx.activity.viewModels
import com.asapplication.app.R
import com.asapplication.app.appcomponents.base.BaseActivity
import com.asapplication.app.databinding.ActivityOne1Binding
import com.asapplication.app.modules.one1.`data`.viewmodel.One1VM
import kotlin.String
import kotlin.Unit

class One1Activity : BaseActivity<ActivityOne1Binding>(R.layout.activity_one1) {
  private val viewModel: One1VM by viewModels<One1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.one1VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONE1ACTIVITY"

  }
}
