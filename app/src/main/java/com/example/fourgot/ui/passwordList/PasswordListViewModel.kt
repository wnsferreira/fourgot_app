//package com.example.fourgot.ui.passwordList
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.fourgot.data.db.entity.VaultEntity
//import com.example.fourgot.repository.VaultRepository
//import kotlinx.coroutines.launch
//
//class PasswordListViewModel(
//    private val repository: VaultRepository
//    ) : ViewModel() {
//
////        val allPasswordsEvent = repository.getAllVault()
//
//    private val _allPasswordsEvent = MutableLiveData<List<VaultEntity>>()
//    val allPasswordsEvent: LiveData<List<VaultEntity>>
//        get() = _allPasswordsEvent
//
//    fun getPasswords() = viewModelScope.launch {
//        _allPasswordsEvent.postValue(repository.getAllVault())
//    }
//}