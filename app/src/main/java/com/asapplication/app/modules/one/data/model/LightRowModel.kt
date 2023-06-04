package com.asapplication.app.modules.one.`data`.model

import com.asapplication.app.R
import com.asapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LightRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMainlight: String? = MyApp.getInstance().resources.getString(R.string.lbl_main_light)

)
