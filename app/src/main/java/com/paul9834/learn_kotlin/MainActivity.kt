package com.paul9834.learn_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), Runnable, View.OnClickListener  {

    val button: Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun run() {

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bottom -> {
                onDestroy()
            }
            R.id.gone -> {
                onPause()
            }
        }
    }
}

