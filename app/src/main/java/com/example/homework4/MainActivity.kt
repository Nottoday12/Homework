package com.example.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.homework4.Fragments.BlankFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var navigation = findViewById<BottomNavigationView>(R.id.bottom_navigatin_view)
        var controller = findNavController(R.id.nav_fragment)
        var appBarConf = AppBarConfiguration(
            setOf(
                R.layout.fragment_blank,
                R.layout.fragment_blank2)
        )

        setupActionBarWithNavController(controller,appBarConf)

        navigation.setupWithNavController(controller)


    }
}