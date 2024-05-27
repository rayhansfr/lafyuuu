package com.example.lafyuu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SuperFlashSaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_super_flash_sale)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val cardItemList = listOf(
            CardItem(R.drawable.react_eng_1, "FS - Nike Air Max 270 React Eng", R.drawable.rating, "$299,43", "$534,33", "24% Off"),
            CardItem(R.drawable.react_eng_2, "FS - Nike Air Max 270 React Eng", R.drawable.rating, "$299,43", "$534,33", "24% Off"),
            CardItem(R.drawable.react_eng_3, "FS - Nike Air Max 270 React Eng", R.drawable.rating, "$299,43", "$534,33", "24% Off"),
            CardItem(R.drawable.react_eng_4, "FS - Nike Air Max 270 React Eng", R.drawable.rating, "$299,43", "$534,33", "24% Off")
        )

        val adapter = CardAdapter(cardItemList)
        recyclerView.adapter = adapter

        val backBtn: ImageView = findViewById(R.id.backBtn)
        backBtn.setOnClickListener {
            Intent(this, HomePage::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }


}