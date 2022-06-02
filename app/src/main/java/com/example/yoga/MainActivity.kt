package com.example.yoga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonHalasan : ImageButton = findViewById(R.id.halasana)
        buttonHalasan.setOnClickListener{halasana()}
        val buttonVajrasana : ImageButton = findViewById(R.id.vajrasana)
        buttonVajrasana.setOnClickListener{vajrasana()}
        val buttonBhujangasana : ImageButton = findViewById(R.id.bhujangasana)
        buttonBhujangasana.setOnClickListener{bhujangasana()}
        val buttonVipareet : ImageButton = findViewById(R.id.vipareet)
        buttonVipareet.setOnClickListener{vipareet()}
    }
    private fun halasana(){
        val foto : ImageView = findViewById(R.id.Yoga)
        foto.setImageResource(R.drawable.halasana)
        val likhna : TextView = findViewById(R.id.Resulttv)
        likhna.text = "Halasana or Plough pose is an inverted asana in hatha yoga and modern yoga as exercise. Its variations include Karnapidasana with the knees by the ears, and Supta Konasana with the feet wide apart."
        val heading : TextView = findViewById(R.id.Heading)
        heading.text = "Halasana"
    }

    private fun vajrasana(){
        val foto : ImageView = findViewById(R.id.Yoga)
        foto.setImageResource(R.drawable.vajrasana)
        val likhna : TextView = findViewById(R.id.Resulttv)
        likhna.text = "Vajrasana, Thunderbolt Pose, or Diamond Pose, is a kneeling asana in hatha yoga and modern yoga as exercise. Medieval texts describe a variety of poses under this name."
        val heading : TextView = findViewById(R.id.Heading)
        heading.text = "Vajrasana"
    }

    private fun bhujangasana(){
        val foto : ImageView = findViewById(R.id.Yoga)
        foto.setImageResource(R.drawable.bhujangasana)
        val likhna : TextView = findViewById(R.id.Resulttv)
        likhna.text = "Bhujangasana or Cobra Pose is a reclining back-bending asana in hatha yoga and modern yoga as exercise. It is commonly performed in a cycle of asanas in Surya Namaskar as an alternative to Urdhva Mukha Svanasana."
        val heading : TextView = findViewById(R.id.Heading)
        heading.text = "Bhujangasana"
    }

    private fun vipareet(){
        val foto : ImageView = findViewById(R.id.Yoga)
        foto.setImageResource(R.drawable.vipareetkaranimudra)
        val likhna : TextView = findViewById(R.id.Resulttv)
        likhna.text = "Viparita Karani or legs up the wall pose is both an asana and a mudra in hatha yoga. In modern yoga as exercise, it is commonly a fully supported pose using a wall and sometimes a pile of blankets."
        val heading : TextView = findViewById(R.id.Heading)
        heading.text = "Vipareet Karani Mudra"
    }
}