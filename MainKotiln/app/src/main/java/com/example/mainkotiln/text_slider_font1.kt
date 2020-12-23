package com.example.mainkotiln


import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

class text_slider_font1(
    context: Context,
    attrs: AttributeSet?
) :
    TextView(context, attrs) {
    init {
        this.typeface = Typeface.createFromAsset(context.assets, "PNU-Medium.ttf")
    }
}