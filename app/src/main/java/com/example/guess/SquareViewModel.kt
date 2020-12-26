package com.example.guess

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SquareViewModel : ViewModel() {


    private var _textLiveData = MutableLiveData<String>()
    val textLiveData: LiveData<String>
        get() = _textLiveData

   fun validate(username :String, password :String){

       if (username == "admin" && password == "admin123"){
            _textLiveData.value = "Success!!"
       }
       else{
           _textLiveData.value = "Fail)"
       }

   }



}