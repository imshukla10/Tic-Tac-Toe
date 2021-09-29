package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //0-X
    //1-O
    var activePlayer=0;
    var gamesState = arrayOf(2,2,2,2,2,2,2,2,2,)
//    0-X
//    1-O
//    2-NULL
    var winPosition= arrayOf(arrayOf(0,1,2), arrayOf(3,4,5), arrayOf(6,7,8),
                             arrayOf(0,3,6), arrayOf(1,4,7), arrayOf(2,5,8),
                             arrayOf(0,4,8), arrayOf(2,4,6) )

    fun tapTap(view: View)
    {
        var img: ImageView = view as ImageView
        var tapped = Integer.parseInt(img.getTag().toString())
        if (gamesState[tapped] == 2) {
            gamesState[tapped] == activePlayer
            img.translationY = -1000f
            var status = findViewById<TextView>(R.id.textView2)
            if (activePlayer == 0) {
                img.setImageResource(R.drawable.x)
                activePlayer = 1
                status.setText("O's Turn Tap to Play")
            }
            else {
                img.setImageResource(R.drawable.o)
                activePlayer = 0
                status.setText("X's turn Tap to Play")
            }
            img.animate().translationYBy(1000f).setDuration(300)
        }

    }
}