package com.googry.googrybaserecyclerview.step2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.googry.googrybaserecyclerview.*
import com.googry.googrybaserecyclerview.databinding.LanguageCodeItemBinding
import kotlinx.android.synthetic.main.step2_activity.*

class Step2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.step2_activity)
        val adapter = object : BaseRecyclerView.Adapter<LanguageCode, LanguageCodeItemBinding>(
            layoutResId = R.layout.language_code_item,
            bindingVariableId = BR.languageCode
        ) {}
        adapter.replaceAll(getLanguageCodeList())
        rvContent.adapter = adapter
    }

}