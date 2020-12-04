package com.example.ciclodevida

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer
    var  ban= false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Activity","Se creo la Actividad")
        mediaPlayer= MediaPlayer.create(this, R.raw.sorry)
        mediaPlayer.isLooping=true
    }
    override fun onStart(){
        super.onStart()
        Log.e("Activity","Se inicio la Actividad")
        if (ban){
            playCancion()
        }
    }
   override  fun onResume(){
       super.onResume()
       Log.e("Activity","Se continuo con la actividad")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity","Se pauso la Actividad")
        pauseCancion()
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity","Se detuvo la Actividad")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity","Se reinicio la Actividad")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity","Se destruyo la Actividad")
    }
    fun PlayCancionClick(v: View){
        ban= true
        playCancion()

    }
    fun PauseCancionClick(v: View){
       pauseCancion()
    }
    fun playCancion(){
        mediaPlayer.start()
    }
    fun pauseCancion(){
        mediaPlayer.pause()
}
}