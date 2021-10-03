package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    var player = true
    var turnCount = 0

    var boardStatus = Array(3){IntArray(3)}

    lateinit var  board : Array<Array<Button>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        board = arrayOf(
            arrayOf(button1,button2,button3),
            arrayOf(button4,button5,button6),
            arrayOf(button7,button8,button9)
        )

        for (i in board){
            for(button in i){
                button.setOnClickListener(this)
            }
        }

        fun initializeBoardStatus(){
            for(i in 0..2){
                for(j in 0..2){
                    boardStatus[0][0]==-1
                    board[0][0].isEnabled = true
                    board[0][0].text = ""
                }
            }
        }

        reset.setOnClickListener {
            initializeBoardStatus()
        }
    }

    override fun onClick(view: View?) {
        when (view?.id){
            R.id.button1 ->{

            }
            R.id.button2 ->{

            }
            R.id.button3 ->{

            }
            R.id.button4 ->{

            }
            R.id.button5 ->{

            }
            R.id.button6 ->{

            }
            R.id.button7 ->{

            }
            R.id.button8 ->{

            }
            R.id.button9 ->{

            }
        }
    }

}