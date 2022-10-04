package com.example.a6monthhomework3.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.a6monthhomework3.base.BaseViewModel

class ProjectViewModel: BaseViewModel() {
    val result = MutableLiveData<Int>()
    var resultAdapter = MutableLiveData<String>()

    var history = ""

    var count = 0

    fun increment() {
        ++count

        result.value = count

        history="$history\n+"

        resultAdapter.value=history
    }

    fun decrement() {
        --count

        result.value = count

        history="$history\n-    "

        resultAdapter.value=history
    }
}