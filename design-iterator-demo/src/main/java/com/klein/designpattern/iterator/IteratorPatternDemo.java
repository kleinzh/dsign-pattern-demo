package com.klein.designpattern.iterator;


import com.klein.designpattern.iterator.Iterator.Iterator;
import com.klein.designpattern.iterator.dto.ClassRoom2;
import com.klein.designpattern.iterator.dto.Student;

/**
 * @author Klein
 * @Classname IteratorPatternDemo
 * @Description 迭代器模式
 * @Date 2021-06-17 9:50
 * @Created by Klein
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {

        Student student1=new Student("小明");

        Student student2=new Student("小王");


        ClassRoom2 classRoom2=new ClassRoom2(2);

        classRoom2.addStudent(student1);
        classRoom2.addStudent(student2);

        // 封装集合迭代的逻辑
        Iterator iterator= classRoom2.iterator();

        while (iterator.hasNext()) {
            System.out.println((Student)iterator.next());
        }

        // 其实一般很少自己写Iterator模式，一般都是在集合编程中使用，尤其是如果要对集合元素进行便利过程中做插入删除操作，那就用Iterator
        // 这个我们会去体验JDK已经封装好的迭代器模式，如果要对某个类中的集合进行便利，由那个集合类直接返回一个iterator回来，然后我们就可以统一面向
        // iterator迭代器接口来编程遍历，提高可维护性，可扩展性
    }

}
