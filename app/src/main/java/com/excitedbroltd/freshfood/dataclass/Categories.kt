package com.excitedbroltd.freshfood.dataclass

import androidx.annotation.ColorInt
import androidx.compose.ui.graphics.Color

data class Categories(
    val foodCategories: String,
    val foodCategoriesId: String,
    @ColorInt val foodCategoriesColor: Color
)
