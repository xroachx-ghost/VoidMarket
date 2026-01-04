package com.voidmarket.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _status = MutableStateFlow("Idle")
    val status: StateFlow<String> = _status
    
    fun setStatus(s: String) {
        viewModelScope.launch {
            _status.value = s
        }
    }
}
