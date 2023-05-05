package com.example.personal_finance_management_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UtilityFetchingActivity : AppCompatActivity() {
    private lateinit var addUtility: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utility_fetching)

        addUtility = findViewById(R.id.addUtility)

        addUtility.setOnClickListener {
            val intent = Intent(this, UtilityInsertionActivity::class.java)
            startActivity(intent)
        }
    }
}