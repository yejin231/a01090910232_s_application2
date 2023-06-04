package com.asapplication.app.modules.one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.asapplication.app.modules.one.`data`.model.LightRowModel
import com.asapplication.app.modules.one.`data`.model.OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OneVM : ViewModel(), KoinComponent {
  val oneModel: MutableLiveData<OneModel> = MutableLiveData(OneModel())

  var navArguments: Bundle? = null

  val lightList: MutableLiveData<MutableList<LightRowModel>> = MutableLiveData(mutableListOf())
}
