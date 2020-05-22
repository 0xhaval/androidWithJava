/*
Author: Omar Mohammad
Date  : 5/22/2020
- This application is just show you MVC architecture in simple way
- Create Package just for DataModer [ pojo: POJO stands for Plain Old Java Object.
                                      It is an ordinary Java object, not bound by any special restriction
                                      other than those forced by the Java Language Specification and not requiring any class path.]
- Create Package just for Activity [ ui ]
 */
package com.example.mvc.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvc.R;
import com.example.mvc.pojo.StudentInfoDB;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView showStudentInfo;
    Button getStudentButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showStudentInfo = findViewById(R.id.textView);
        getStudentButton = findViewById(R.id.button);

        // tell to app this button is take onClick method [ this = OnClickListener ]
        getStudentButton.setOnClickListener(this);
    }

    /*
        getStudentNameFromDataBase() method work with my Database (class student).
        Method return Anonymous Object
        Handling Data from Database
     */
    public StudentInfoDB getStudentNameFromDataBase(){
        return new StudentInfoDB("Omar",22,98);
    }

    /*
        getStudent() method print the name of student by another method with getName
        Handle Event from User input
     */
    public void getStudent(){
        showStudentInfo.setText(getStudentNameFromDataBase().getName());
    }

    /*
        onClick method is implement for View.OnClickListener interface.
        Interactive with button
     */
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button)
            getStudent();
    }
}
