package com.lakshaysethi.driverhelper.ui.newTrip;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewTripViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NewTripViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}