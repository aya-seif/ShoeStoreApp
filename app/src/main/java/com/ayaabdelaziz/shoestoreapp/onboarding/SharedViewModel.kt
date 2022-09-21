package com.ayaabdelaziz.shoestoreapp.onboarding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    var mutableLiveData = MutableLiveData<MutableList<Shoe>>(mutableListOf())

    var livedata: LiveData<MutableList<Shoe>> = mutableLiveData


    fun addShoe(shoe : Shoe) {
        mutableLiveData.value?.add(shoe)
    }
}