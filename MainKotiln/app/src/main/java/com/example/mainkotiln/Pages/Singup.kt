package com.example.mainkotiln.Pages


import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainkotiln.R

class Singup : AppCompatActivity() {
    var password1: EditText? = null
    var passwordconfirm: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
        password1 = findViewById<View>(R.id.ed_password) as EditText
        passwordconfirm = findViewById<View>(R.id.ed_passwordconfirm) as EditText
    }

    fun passhiden(view: View) {
        if (view.id == R.id.imageseyes) {
            if (password1!!.transformationMethod == PasswordTransformationMethod.getInstance()) {
                (view as ImageView).setImageResource(R.drawable.ic_remove_red_eye_black_24dp)
                password1!!.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                (view as ImageView).setImageResource(R.drawable.ic_visibility_off_black_24dp)
                password1!!.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
        if (view.id == R.id.imageseyes2) {
            if (passwordconfirm!!.transformationMethod == PasswordTransformationMethod.getInstance()) {
                (view as ImageView).setImageResource(R.drawable.ic_remove_red_eye_black_24dp)
                passwordconfirm!!.transformationMethod =
                    HideReturnsTransformationMethod.getInstance()
            } else {
                (view as ImageView).setImageResource(R.drawable.ic_visibility_off_black_24dp)
                passwordconfirm!!.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
    }
}