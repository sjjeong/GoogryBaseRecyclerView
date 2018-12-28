package com.googry.googrybaserecyclerview.step3

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.googry.googrybaserecyclerview.BR
import com.googry.googrybaserecyclerview.BaseRecyclerView
import com.googry.googrybaserecyclerview.LanguageCode
import com.googry.googrybaserecyclerview.R
import com.googry.googrybaserecyclerview.databinding.LanguageCodeItemBinding
import com.googry.googrybaserecyclerview.databinding.Step3ActivityBinding

class Step3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<Step3ActivityBinding>(this, R.layout.step3_activity)
        binding.run {
            setLifecycleOwner(this@Step3Activity)
            vm = ViewModelProviders.of(this@Step3Activity)[LanguageCodeViewModel::class.java]
            rvContent.adapter = object : BaseRecyclerView.Adapter<LanguageCode, LanguageCodeItemBinding>(
                layoutResId = R.layout.language_code_item,
                bindingVariableId = BR.languageCode
            ) {}
        }
    }

}