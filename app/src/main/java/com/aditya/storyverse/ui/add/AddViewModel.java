package com.aditya.storyverse.ui.add;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AddViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is add fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
    public void setText(String text) {
        mText.setValue(text);
    }

}