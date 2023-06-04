package com.asapplication.app.modules.two.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.asapplication.app.modules.two.`data`.model.TwoModel
import com.asapplication.app.modules.two.`data`.model.TwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TwoVM : ViewModel(), KoinComponent {
  val twoModel: MutableLiveData<TwoModel> = MutableLiveData(TwoModel())

  var navArguments: Bundle? = null

  val twoList: MutableLiveData<MutableList<TwoRowModel>> = MutableLiveData(mutableListOf())
}
