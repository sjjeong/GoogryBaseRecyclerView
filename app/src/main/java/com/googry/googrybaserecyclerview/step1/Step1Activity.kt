package com.googry.googrybaserecyclerview.step1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.googry.googrybaserecyclerview.R
import com.googry.googrybaserecyclerview.getLanguageCodeList
import kotlinx.android.synthetic.main.step1_activity.*

class Step1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.step1_activity)
        rvContent.adapter = Step1Adapter().apply { replaceAll(getLanguageCodeList()) }
    }
}