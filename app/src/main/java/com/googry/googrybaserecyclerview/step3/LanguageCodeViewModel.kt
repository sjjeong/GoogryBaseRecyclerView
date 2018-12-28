package com.googry.googrybaserecyclerview.step3

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.googry.googrybaserecyclerview.LanguageCode
import com.googry.googrybaserecyclerview.getLanguageCodeList

class LanguageCodeViewModel : ViewModel() {

    val liveLanguageCodeList = MutableLiveData<List<LanguageCode>>()

    init {
        liveLanguageCodeList.postValue(getLanguageCodeList())
    }

}