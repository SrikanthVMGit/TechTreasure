package com.example.techtreasure

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Report : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        // Retrieve selected items and total price from intent extras
        val selectedProcessor = intent.getStringExtra("Processor")
        val selectedGraphicsCard = intent.getStringExtra("GraphicsCard")
        val selectedRAM = intent.getStringExtra("RAM")
        val selectedMotherboard = intent.getStringExtra("Motherboard")
        val selectedSSD = intent.getStringExtra("SSD")
        val selectedPowerSupply = intent.getStringExtra("PowerSupply")
        val selectedCabinet = intent.getStringExtra("Cabinet")
        val totalPrice = intent.getIntExtra("TotalPrice", 0)

        // Display selected items and total price in TextViews
        val processorTextView = findViewById<TextView>(R.id.processorTextView)
        val graphicsCardTextView = findViewById<TextView>(R.id.graphicsCardTextView)
        val ramTextView = findViewById<TextView>(R.id.ramTextView)
        val motherboardTextView = findViewById<TextView>(R.id.motherboardTextView)
        val ssdTextView = findViewById<TextView>(R.id.ssdTextView)
        val powerSupplyTextView = findViewById<TextView>(R.id.powerSupplyTextView)
        val cabinetTextView = findViewById<TextView>(R.id.cabinetTextView)
        val totalPriceTextView = findViewById<TextView>(R.id.totalPriceTextView)

        processorTextView.text = "Processor: $selectedProcessor"
        graphicsCardTextView.text = "Graphics Card: $selectedGraphicsCard"
        ramTextView.text = "RAM: $selectedRAM"
        motherboardTextView.text = "Motherboard: $selectedMotherboard"
        ssdTextView.text = "SSD: $selectedSSD"
        powerSupplyTextView.text = "Power Supply: $selectedPowerSupply"
        cabinetTextView.text = "Cabinet: $selectedCabinet"
        totalPriceTextView.text = "Total Price: ₹$totalPrice"
    }
}
