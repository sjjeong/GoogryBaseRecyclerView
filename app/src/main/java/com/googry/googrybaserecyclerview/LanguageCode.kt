package com.googry.googrybaserecyclerview

data class LanguageCode(
    val language: String,
    val code: String
)

fun getLanguageCodeList() =
    mutableListOf(
        LanguageCode("아랍어", "ar-XA"),
        LanguageCode("불가리아어", "bg"),
        LanguageCode("크로아티아어", "hr"),
        LanguageCode("체코어", "cs"),
        LanguageCode("덴마크어", "da"),
        LanguageCode("독일어", "de"),
        LanguageCode("그리스어", "el"),
        LanguageCode("영어", "en"),
        LanguageCode("에스토니아어    ", "et"),
        LanguageCode("스페인어", "es"),
        LanguageCode("핀란드어", "fi"),
        LanguageCode("프랑스어", "fr"),
        LanguageCode("아일랜드어", "ga"),
        LanguageCode("힌디어", "hi"),
        LanguageCode("헝가리어", "hu"),
        LanguageCode("히브리어", "he"),
        LanguageCode("이탈리아어", "it"),
        LanguageCode("일본어", "ja"),
        LanguageCode("한국어", "ko"),
        LanguageCode("라트비아어", "lv"),
        LanguageCode("리투아니아어", "lt"),
        LanguageCode("네덜란드어", "nl"),
        LanguageCode("노르웨이어", "no"),
        LanguageCode("폴란드어", "pl"),
        LanguageCode("포르투갈어", "pt"),
        LanguageCode("스웨덴어", "sv"),
        LanguageCode("루마니아어", "ro"),
        LanguageCode("러시아어", "ru"),
        LanguageCode("세르비아어", "sr-CS"),
        LanguageCode("슬로바키아어", "sk"),
        LanguageCode("슬로베니아어", "sl"),
        LanguageCode("태국어", "th"),
        LanguageCode("터키어", "tr"),
        LanguageCode("우크라이나어", "uk-UA"),
        LanguageCode("중국어(간체)", "zh-chs"),
        LanguageCode("중국어(번체)", "zh-cht")
    )