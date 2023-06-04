package com.asapplication.app.modules.two1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.asapplication.app.modules.two1.`data`.model.Two1Model
import org.koin.core.KoinComponent

class Two1VM : ViewModel(), KoinComponent {
  val two1Model: MutableLiveData<Two1Model> = MutableLiveData(Two1Model())

  var navArguments: Bundle? = null
}
