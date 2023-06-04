package com.asapplication.app.modules.two1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.asapplication.app.R
import com.asapplication.app.appcomponents.base.BaseActivity
import com.asapplication.app.databinding.ActivityTwo1Binding
import com.asapplication.app.modules.dhi2.ui.Dhi2Activity
import com.asapplication.app.modules.dhi6.ui.Dhi6Activity
import com.asapplication.app.modules.dhi9.ui.Dhi9Activity
import com.asapplication.app.modules.two1.`data`.viewmodel.Two1VM
import kotlin.String
import kotlin.Unit

class Two1Activity : BaseActivity<ActivityTwo1Binding>(R.layout.activity_two1) {
  private val viewModel: Two1VM by viewModels<Two1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.two1VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnvector.setOnClickListener {
      val destIntent = Dhi6Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumncomputer.setOnClickListener {
      val destIntent = Dhi9Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumncalendar.setOnClickListener {
      val destIntent = Dhi2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TWO1ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Two1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
