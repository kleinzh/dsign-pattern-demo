package com.klein.designpattern.iterator.dto;

import java.util.Map;

/**
 * @author Klein
 * @Classname ClassRoom
 * @Description 教室
 * @Date 2021-06-17 9:30
 * @Created by Klein
 */
public class ClassRoom {

    /**
     * 假如处于一定的原因，我不想勇数组去存储学生信息了， Map?
     */
//    private Student[] students;
    private Map<String,Student> students;

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }

    //    public Student[] getStudents() {
//        return students;
//    }
//
//    public void setStudents(Student[] students) {
//        this.students = students;
//    }
}
