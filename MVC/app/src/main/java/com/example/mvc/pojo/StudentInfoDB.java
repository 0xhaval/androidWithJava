package com.example.mvc.pojo;
/*
    This class is implement Student DataBase in simple way
 */
public class StudentInfoDB {

    String name;
    int age, degree;

    // create constructor to variable
    public StudentInfoDB(String name, int age, int degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    // create setter and getter to all variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
