package com.example.techtreasure
import android.widget.Spinner
import android.widget.AdapterView
import android.widget.ImageView
import android.view.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class amdbuild : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amdbuild)

        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)

        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                if (selectedItem == "Processor 1") {
                    imageView1.setImageResource(R.drawable.headd)
                } else if (selectedItem == "Processor 2") {
                    imageView1.setImageResource(R.drawable.header)
                }
                // Add more conditions as needed for other processor options
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case when nothing is selected
            }
        }

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                if (selectedItem == "Graphics Card 1") {
                    imageView2.setImageResource(R.drawable.intelbutton)
                } else if (selectedItem == "Graphics Card 2") {
                    imageView2.setImageResource(R.drawable.homebg)
                }
                // Add more conditions as needed for other graphics card options
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle case when nothing is selected
            }
        }
    }
}
