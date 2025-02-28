// MainActivity.kt
package com.singhsde.colortoolbar

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI
        toolbar = findViewById(R.id.toolbar)
        tabLayout = findViewById(R.id.tabLayout)

        // Use toolbar as the action bar
        setSupportActionBar(toolbar)

        // Default toolbar color
        toolbar.setBackgroundColor(Color.RED)

        // Add tabs
        tabLayout.addTab(tabLayout.newTab().setText("Red"))
        tabLayout.addTab(tabLayout.newTab().setText("Black"))
        tabLayout.addTab(tabLayout.newTab().setText("Green"))

        // Add listener for tab selection to change toolbar color
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> toolbar.setBackgroundColor(Color.RED)
                    1 -> toolbar.setBackgroundColor(Color.BLACK)
                    2 -> toolbar.setBackgroundColor(Color.GREEN)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })
    }
}