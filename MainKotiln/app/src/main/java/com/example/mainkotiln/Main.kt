package com.example.mainkotiln

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import com.example.mainkotiln.R
import kotlinx.android.synthetic.main.activity_main.*


class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment(fragmentHome.newInstance())
        meowbottomnavigation.add(MeowBottomNavigation.Model(1,R.drawable.ic_notifications_black_24dp))
        meowbottomnavigation.add(MeowBottomNavigation.Model(2,R.drawable.ic_favorite_black_24dp))
        meowbottomnavigation.add(MeowBottomNavigation.Model(3,R.drawable.ic_home_black_24dp))
        meowbottomnavigation.add(MeowBottomNavigation.Model(4,R.drawable.ic_mode_edit_black_24dp))
        meowbottomnavigation.add(MeowBottomNavigation.Model(5,R.drawable.ic_person_black_24dp))
        meowbottomnavigation.setOnClickMenuListener {
            when(it.id){
                1-> setFragment(fragmenNot.newInstance())
                2-> setFragment(fragmentFav.newInstance())
                3-> setFragment(fragmentHome.newInstance())
                4-> setFragment(fragmentSuggesion.newInstance())
                5-> setFragment(fragmentUser.newInstance())
                else ->' '
            }
        }
        meowbottomnavigation.show(3)
    }
    fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment,fragment,"Main")
            .commit()
    }
}