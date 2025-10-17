package com.example.cataloguestatique
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnCatalogue = findViewById<Button>(R.id.btncatalog)
        btnCatalogue.setOnClickListener {
            val intent = Intent(this,CatalogueActivity::class.java)
            startActivity(intent)
        }
    }
}