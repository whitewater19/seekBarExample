package com.example.seekbarexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.SeekBar
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    var pos1:Int =255
    var pos2:Int =255
    var pos3:Int =255
    lateinit var background:ConstraintLayout
    lateinit var seek_red: SeekBar
    lateinit var seek_green:SeekBar
    lateinit var seek_blue:SeekBar
    lateinit var edt_red:EditText
    lateinit var edt_green:EditText
    lateinit var edt_blue:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        background=findViewById(R.id.background)
        seek_red=findViewById(R.id.seekBarR)
        seek_green=findViewById(R.id.seekBarG)
        seek_blue=findViewById(R.id.seekBarB)
        edt_red=findViewById(R.id.editTextR)
        edt_green=findViewById(R.id.editTextG)
        edt_blue=findViewById(R.id.editTextB)
        seek_red.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                edt_red.setText(progress.toString())
                pos1=progress
                background.setBackgroundColor(Color.rgb(pos1,pos2,pos3))
                Log.d("redVal=",pos1.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })
        seek_green.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                edt_green.setText(progress.toString())
                pos2=progress
                background.setBackgroundColor(Color.rgb(pos1,pos2,pos3))
                Log.d("greenVal=",pos2.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })
        seek_blue.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                edt_blue.setText(progress.toString())
                pos3=progress
                background.setBackgroundColor(Color.rgb(pos1,pos2,pos3))
                Log.d("blueVal=",pos1.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }


        })
    }
}
