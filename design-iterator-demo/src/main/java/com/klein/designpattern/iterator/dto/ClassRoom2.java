package com.klein.designpattern.iterator.dto;

import com.klein.designpattern.iterator.Iterator.Aggregate;
import com.klein.designpattern.iterator.Iterator.Iterator;

/**
 * @author Klein
 * @Classname ClassRoom2
 * @Description TODO
 * @Date 2021-06-17 9:56
 * @Created by Klein
 */
public class ClassRoom2 implements Aggregate {

    private Student[] students;

    private int last=0;

    public ClassRoom2(int size) {
        students=new Student[size];
    }

    public Student getStudent(int index) {
        return students[index];
    }

    public void addStudent(Student student) {
        students[last]=student;
        last++;
    }

    public  int getLength() {
        return students.length;
    }
    @Override
    public Iterator iterator() {
        return new ClassRoom2Iterator(this);
    }
}
