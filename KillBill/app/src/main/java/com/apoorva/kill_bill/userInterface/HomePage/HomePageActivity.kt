package com.apoorva.kill_bill.userInterface.HomePage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apoorva.kill_bill.R
import com.apoorva.kill_bill.userInterface.captureAmount.CaptureAmountActivity
import kotlinx.android.synthetic.main.activity_homepage_layout.*

class HomePageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage_layout)

        //Open capture bill amount from image activity
        capture_amount_btn.setOnClickListener {
            val intent = Intent(this, CaptureAmountActivity::class.java)
            startActivity(intent)
        }
    }
}