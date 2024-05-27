package com.example.lafyuu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
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

        val adapter = CardAdapter(cardItemList) {
            startActivity(Intent(this, DetailProductActivity::class.java))
        }

        recyclerView.adapter = adapter

        val superflashBtn: ImageView = findViewById(R.id.superflashBtn)
        superflashBtn.setOnClickListener {
            Intent(this, SuperFlashSaleActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }


        val redShoe: LinearLayout = findViewById(R.id.product)
        redShoe.setOnClickListener {
            Intent(this, DetailProductActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }

        val redShoe2: LinearLayout = findViewById(R.id.product1)
        redShoe2.setOnClickListener {
            Intent(this, DetailProductActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }

        val favBtn: ImageView = findViewById(R.id.favBtn)
        favBtn.setOnClickListener {
            Intent(this, FavouriteItemsActivity::class.java).also {
                startActivity(it)
                finish()
            }
        }
    }
}