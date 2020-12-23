package com.example.mainkotiln

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.Button

class button_slider_font(
    context: Context,
    attrs: AttributeSet?
) :
    Button(context, attrs) {
    init {
        this.typeface = Typeface.createFromAsset(context.assets, "PNU-Medium.ttf")
    }
}