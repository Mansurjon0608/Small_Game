package com.example.yakuniydatabase

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        onResume()
    }


    override fun onResume() {
        super.onResume()



        image1.visibility = View.GONE
        image2.visibility = View.GONE
        image3.visibility = View.GONE
        image4.visibility = View.GONE
        image5.visibility = View.GONE
        image6.visibility = View.GONE
        image8.visibility = View.GONE
        image9.visibility = View.GONE
        image10.visibility = View.GONE
        image11.visibility = View.GONE
        image12.visibility = View.GONE

        l1.setOnClickListener {
            allGone()
            image1.visibility = View.VISIBLE

        }

        l2.setOnClickListener {
            allGone()
            image2.visibility = View.VISIBLE

        }

        l3.setOnClickListener {
            allGone()
            image3.visibility = View.VISIBLE

        }

        l4.setOnClickListener {
            allGone()
            image4.visibility = View.VISIBLE

        }

        l5.setOnClickListener {
            allGone()
            image5.visibility = View.VISIBLE

        }

        l6.setOnClickListener {
            allGone()
            image6.visibility = View.VISIBLE

        }

        l7.setOnClickListener {
            allGone()
            image7.visibility = View.VISIBLE

        }

        l8.setOnClickListener {
            allGone()
            image8.visibility = View.VISIBLE

        }

        l9.setOnClickListener {
            allGone()
            image9.visibility = View.VISIBLE

        }

        l10.setOnClickListener {
            allGone()
            image10.visibility = View.VISIBLE

        }

        l11.setOnClickListener {
            allGone()
            image11.visibility = View.VISIBLE

        }

        l12.setOnClickListener {
            allGone()
            image12.visibility = View.VISIBLE

        }
    }

    fun allGone(){

        image1.visibility = View.GONE
        image2.visibility = View.GONE
        image3.visibility = View.GONE
        image4.visibility = View.GONE
        image5.visibility = View.GONE
        image6.visibility = View.GONE
        image7.visibility = View.GONE
        image8.visibility = View.GONE
        image9.visibility = View.GONE
        image10.visibility = View.GONE
        image11.visibility = View.GONE
        image12.visibility = View.GONE

    }

}