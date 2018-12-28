package com.googry.googrybaserecyclerview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.googry.googrybaserecyclerview.step1.Step1Activity
import com.googry.googrybaserecyclerview.step2.Step2Activity
import com.googry.googrybaserecyclerview.step3.Step3Activity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        btnStep1.setOnClickListener { startActivity(Intent(this, Step1Activity::class.java)) }
        btnStep2.setOnClickListener { startActivity(Intent(this, Step2Activity::class.java)) }
        btnStep3.setOnClickListener { startActivity(Intent(this, Step3Activity::class.java)) }
    }
}
