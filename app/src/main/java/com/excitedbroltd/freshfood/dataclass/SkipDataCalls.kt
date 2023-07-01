package com.excitedbroltd.freshfood.dataclass

import androidx.annotation.DrawableRes

data class SkipDataCalls(
    val title1: String,
    val title2: String,
    val title3: String,
    val desc1: String,
    val desc2: String,
    @DrawableRes val pictureId: Int
)
