package com.asapplication.app.modules.one1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.asapplication.app.modules.one1.`data`.model.One1Model
import org.koin.core.KoinComponent

class One1VM : ViewModel(), KoinComponent {
  val one1Model: MutableLiveData<One1Model> = MutableLiveData(One1Model())

  var navArguments: Bundle? = null
}
