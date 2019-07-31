package com.example.myapplication.interest;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityInterestBinding;

public class InterestActivity extends AppCompatActivity {

    private ActivityInterestBinding binding;

    private InterestViewModel interestViewModel = new InterestViewModel();

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_interest);

        interestViewModel = ViewModelProviders.of(this).get(InterestViewModel.class);

        binding.setInterestViewModel(interestViewModel);

        //不要儲存Activity/Fragment的內容或context在ViewModel中，會被destroy

    }
}