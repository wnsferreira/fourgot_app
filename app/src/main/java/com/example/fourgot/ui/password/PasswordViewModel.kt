package com.example.fourgot.ui.password

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fourgot.R
import com.example.fourgot.repository.VaultRepository
import kotlinx.coroutines.launch
import java.lang.Exception

class PasswordViewModel(
    private val repository: VaultRepository
) : ViewModel() {

    // notifica quando uma senha foi cadastrada
    private val _passwordStateEventData = MutableLiveData<PasswordState>()
    val passwordStateEventData: LiveData<PasswordState>
        get() = _passwordStateEventData

    private val _messageEventData = MutableLiveData<Int>()
    val messageEventData: LiveData<Int>
        get() = _messageEventData

    fun addPassword(name: String, password: String, email: String, url: String) = viewModelScope.launch {
        try {
            val id = repository.insertVault(name, password, email, url)
            if (id > 0){
                _passwordStateEventData.value = PasswordState.Inserted
                _messageEventData.value = R.string.password_inserted_successfully
            }
        }catch (ex: Exception){
            _messageEventData.value = R.string.password_error_to_insert
            Log.e(TAG,ex.toString())
        }
    }

    companion object {
        private val TAG = PasswordViewModel::class.java.simpleName
    }

    sealed class PasswordState {
        object Inserted : PasswordState()
    }

}


