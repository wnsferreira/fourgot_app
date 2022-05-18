package com.example.fourgot.extension

import android.content.Context
import android.view.WindowManager.LayoutParams.*
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.hideKeyboard(){
    val view = this.currentFocus
    if (view != null){
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    window.setSoftInputMode(SOFT_INPUT_STATE_ALWAYS_HIDDEN)
}