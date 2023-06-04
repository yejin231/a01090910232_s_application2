package com.asapplication.app.modules.one1.`data`.model

import com.asapplication.app.R
import com.asapplication.app.appcomponents.di.MyApp
import kotlin.String

data class One1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl17)

)
