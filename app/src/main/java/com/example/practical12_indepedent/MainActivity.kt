package com.example.practical12_indepedent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val star1 : ImageView = findViewById(R.id.star1)
        val star2 : ImageView = findViewById(R.id.star2)
        val star3 : ImageView = findViewById(R.id.star3)
        val moveStar1 : Animation = AnimationUtils.loadAnimation(this, R.anim.move_star1)
        star1.startAnimation(moveStar1)
        val moveStar2 : Animation = AnimationUtils.loadAnimation(this, R.anim.move_star2)
        val moveStar3 : Animation = AnimationUtils.loadAnimation(this, R.anim.move_star3)
        star2.startAnimation(moveStar2)
        star3.startAnimation(moveStar3)
    }
}

