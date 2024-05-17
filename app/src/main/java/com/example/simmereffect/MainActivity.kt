package com.example.simmereffect

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.facebook.shimmer.ShimmerFrameLayout


class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var container : ShimmerFrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);


        // Button 1 to start Shimmer Effect
        button1.setOnClickListener { // If auto-start is set to false
            container.startShimmer()
        }


        // Button 2 to stop Shimmer Effect
        button2.setOnClickListener { // If auto-start is set to false
            container.stopShimmer()
        }

        // Shimmer effect
        container = findViewById(R.id.shimmer_view_container);

    }
}