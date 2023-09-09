package com.prplmnstr.invoicegeneratorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.prplmnstr.invoicegeneratorapp.databinding.ActivityNewInvoiceGeneratorBinding

class NewInvoiceGenerator : AppCompatActivity() {
    private lateinit var binding: ActivityNewInvoiceGeneratorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewInvoiceGeneratorBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set the custom Toolbar
        setSupportActionBar(binding.toolbar)

        // Enable the back button (up navigation)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        // Set a custom title (activity name)
        supportActionBar?.title = "New Invoice"

        // Get a reference to the back button drawable
        val upArrow = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back)

// Set the tint color (white in this case)
        upArrow?.setTint(ContextCompat.getColor(this, android.R.color.white))

// Set the customized icon as the navigation icon
        supportActionBar?.setHomeAsUpIndicator(upArrow)

        // Set the click listener for the back button (optional)
        binding.toolbar.setNavigationOnClickListener {
            onBackPressed() // Handle back button click
        }



        // Rest of your activity code
    }

    // Rest of your activity code
}