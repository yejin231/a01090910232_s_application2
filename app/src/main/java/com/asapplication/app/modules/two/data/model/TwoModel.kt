package com.asapplication.app.modules.two.`data`.model

import com.asapplication.app.R
import com.asapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.msg_wifi_tw1r_413_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3newdevices: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_new_devices)

)
