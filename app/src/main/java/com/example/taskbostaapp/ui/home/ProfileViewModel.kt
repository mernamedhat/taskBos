package com.example.taskbostaapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.taskbostaapp.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject




@HiltViewModel
class ProfileViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
//    private val _userData = MutableLiveData<UserResponse>()
//    val userData: LiveData<UserResponse> get() = _userData
//
//    fun getUserData() {
//        viewModelScope.launch {
//            val user = repository.getUser()
//            _userData.postValue(user)
//        }
//    }

    fun getHome() = liveData {
        emit(
            repository.getUser()
        )
    }
}