package com.example.mvc.ui;

import com.example.mvc.pojo.StudentInfoDB;

/*
    In this Presenter will go to Database and get the data
 */
public class StudentPresenter {
    // interface type to deal with method
    StudentView view;

    public StudentPresenter(StudentView view) {
        this.view = view;
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
    when Presenter get name, tell the interface has name and send it to Activity
     */
    public void getStudentName(){
        view.onGetStudentName(getStudentNameFromDataBase().getName());
    }

}
