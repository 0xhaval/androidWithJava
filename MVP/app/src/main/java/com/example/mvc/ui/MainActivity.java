/*
Author: Omar Mohammad
Date  : 5/22/2020
Subject: MVP, ButterKnife
- This application is just show you MVP architecture in simple way
- Create Package just for DataModer [ pojo: POJO stands for Plain Old Java Object.
                                      It is an ordinary Java object, not bound by any special restriction
                                      other than those forced by the Java Language Specification and not requiring any class path.]
- Create Package just for Activity [ ui ]
- Create Presenter [ class ] to deal with Model [ DataBase ]
- Create Interface class to deal between Activity and Presenter
- In this Design Activity just deal with view not Model
 */
package com.example.mvc.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvc.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, StudentView {

    StudentPresenter presenter;
    @BindView(R.id.textView)    // Build by ButterKnife
    TextView showStudentInfo;
    @BindView(R.id.button)      // Build by ButterKnife
    Button getStudentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        // tell to app this button is take onClick method [ this = OnClickListener ]
        getStudentButton.setOnClickListener(this);

        /*
        Presenter know who is ask for view.
        passing interface but instead of, I force Activity to implement interface method StudentView
         */
        presenter = new StudentPresenter(this);
    }


    /*
        onClick method is implement for View.OnClickListener interface.
        Interactive with button
     */
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button)
            // get to take data from presenter
            presenter.getStudentName();
    }

    @Override
    public void onGetStudentName(String name) {
        // receive name from interface
        showStudentInfo.setText(name);
    }
}
