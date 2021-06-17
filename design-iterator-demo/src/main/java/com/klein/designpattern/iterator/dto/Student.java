package com.klein.designpattern.iterator.dto;

/**
 * @author Klein
 * @Classname Student
 * @Description 学生
 * @Date 2021-06-17 9:28
 * @Created by Klein
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
