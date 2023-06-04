package com.asapplication.app.modules.two.`data`.model

import com.asapplication.app.R
import com.asapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBorkV530: String? = MyApp.getInstance().resources.getString(R.string.lbl_bork_v530)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVacuumcleaner: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vacuum_cleaner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLIFXLEDLight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lifx_led_light)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSmartbulb: String? = MyApp.getInstance().resources.getString(R.string.lbl_smart_bulb)

)
