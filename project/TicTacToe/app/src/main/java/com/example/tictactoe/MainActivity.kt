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
    var gameActive:Boolean = true
    //0-X
    //1-O
    var activePlayer=0
    var gamesState = arrayOf(2,2,2,2,2,2,2,2,2,)
//    0-X
//    1-O
//    2-NULL
    var winPositions= arrayOf(arrayOf(0,1,2), arrayOf(3,4,5), arrayOf(6,7,8),
                             arrayOf(0,3,6), arrayOf(1,4,7), arrayOf(2,5,8),
                             arrayOf(0,4,8), arrayOf(2,4,6) )

    fun tapTap(view: View)
    {
        val img: ImageView = view as ImageView
        val tapped = Integer.parseInt(img.getTag().toString())
        if(!gameActive){
            gameReset()
        }
        if (gamesState[tapped] == 2 && gameActive) {
            gamesState[tapped] = activePlayer
            img.translationY = -1000f
            val status = findViewById<TextView>(R.id.textView2)
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
        for(winPosition in winPositions) {
            // somebody won we have to find out who win
            if((gamesState[winPosition[0]]==gamesState[winPosition[1]]) && (gamesState[winPosition[1]]==gamesState[winPosition[2]]) && gamesState[winPosition[0]]!=2)
            {
                var winner:String
                gameActive = false
                if (gamesState[winPosition[0]]==0){
                    winner = "X has won"
                }
                else{
                    winner = "O has won"
                }
//              Winner anouncement
                val status = findViewById<TextView>(R.id.textView2)
                status.setText(winner)

            }

        }
    }

    private fun gameReset() {
        gameActive = true
        activePlayer = 0
        for(i in 0..gamesState.size){
            gamesState[i] = 2
        }
        findViewById<ImageView>(R.id.imageView1).setImageResource(0)
        findViewById<ImageView>(R.id.imageView2).setImageResource(0)
        findViewById<ImageView>(R.id.imageView3).setImageResource(0)
        findViewById<ImageView>(R.id.imageView4).setImageResource(0)
        findViewById<ImageView>(R.id.imageView5).setImageResource(0)
        findViewById<ImageView>(R.id.imageView6).setImageResource(0)
        findViewById<ImageView>(R.id.imageView7).setImageResource(0)
        findViewById<ImageView>(R.id.imageView8).setImageResource(0)
        findViewById<ImageView>(R.id.imageView9).setImageResource(0)

    }
}