package com.klein.designpattern.iterator.dto;

import com.klein.designpattern.iterator.Iterator.Iterator;

/**
 * @author Klein
 * @Classname ClassRoom2Iterator
 * @Description 教师迭代器
 * @Date 2021-06-17 10:03
 * @Created by Klein
 */
public class ClassRoom2Iterator implements Iterator {

    private ClassRoom2 classRoom2;

    private int index;

    public ClassRoom2Iterator(ClassRoom2 classRoom2) {
        this.classRoom2 = classRoom2;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < classRoom2.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Student student= classRoom2.getStudent(index);
        index++;
        return student;
    }
}
