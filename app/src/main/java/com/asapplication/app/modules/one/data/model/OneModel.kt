package com.asapplication.app.modules.one.`data`.model

import com.asapplication.app.R
import com.asapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBedroom: String? = MyApp.getInstance().resources.getString(R.string.lbl_bedroom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_36)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHumidifierAir: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_humidifier_air)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtModeCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_mode_2)

)
