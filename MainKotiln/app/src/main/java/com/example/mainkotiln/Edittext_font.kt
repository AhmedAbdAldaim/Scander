package com.example.mainkotiln

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.EditText

/**
 * Created by SoSo on 3/23/2020.
 */
class Edittext_font(
    context: Context,
    attrs: AttributeSet?
) :
    EditText(context, attrs) {
    init {
        this.typeface = Typeface.createFromAsset(context.assets, "PNU-Medium.ttf")
    }
}
