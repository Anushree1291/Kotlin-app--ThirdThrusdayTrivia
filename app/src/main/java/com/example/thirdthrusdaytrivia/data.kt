package com.example.thirdthrusdaytrivia

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class data(@DrawableRes val imageId:Int,@StringRes  val name:Int, @StringRes val menu:Int, val rating:Int, val price:Int)
