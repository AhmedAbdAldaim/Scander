package com.example.mainkotiln.Pages

import android.content.Intent
import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainkotiln.R

class Login : AppCompatActivity() {
    var password: EditText? = null
    var phone: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        password = findViewById<View>(R.id.ed_password) as EditText
        phone = findViewById<View>(R.id.ed_phone) as EditText
        phone!!.addTextChangedListener(PhoneNumberFormattingTextWatcher())
    }

    fun reg(view: View?) {
        val intent = Intent(this@Login, Singup::class.java)
        startActivity(intent)
    }

    fun passhiden(view: View) {
        if (view.id == R.id.imageseyes) {
            if (password!!.transformationMethod == PasswordTransformationMethod.getInstance()) {
                (view as ImageView).setImageResource(R.drawable.ic_remove_red_eye_black_24dp)
                password!!.transformationMethod = HideReturnsTransformationMethod.getInstance()
            } else {
                (view as ImageView).setImageResource(R.drawable.ic_visibility_off_black_24dp)
                password!!.transformationMethod = PasswordTransformationMethod.getInstance()
            }
        }
    }

    fun login(view: View?) {
        val intent = Intent(this@Login, Main::class.java)
        startActivity(intent)
    }
}