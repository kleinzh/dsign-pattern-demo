package com.klein.designpattern.iterator;

import com.klein.designpattern.iterator.dto.ClassRoom;
import com.klein.designpattern.iterator.dto.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Klein
 * @Classname WithOutPatternApplication
 * @Description 没有使用设计模式
 * @Date 2021-06-17 9:31
 * @Created by Klein
 */
public class WithOutIteratorPatternDemo {

    public static void main(String[] args) {

        Student student1=new Student("小明");

        Student student2=new Student("小王");

//        Student[] students=new Student[2];
//        students[0]=student1;
//        students[1]=student2;

        Map<String,Student> studentsMap=new HashMap<>();
        studentsMap.put(student1.getName(),student1);
        studentsMap.put(student2.getName(),student2);

        ClassRoom classRoom=new ClassRoom();
        classRoom.setStudents(studentsMap);

//        Student[] classRoomUsers=classRoom.getStudents();
//
//        for (Student classRoomUser : classRoomUsers) {
//            System.out.println(classRoomUser);
//        }
        Map<String,Student> studentMap=classRoom.getStudents();

        for ( Student result : studentMap.values()) {
            System.out.println(result);
        }

         //  如果不用任何设计模式，直接去便利一个类中的集合
         //一旦这个类中的对集合的使用改版了，比如说数组->map，还有别的可能
         // 你迭代的这块代码就需要改动
         // 如果说代码和业务逻辑很复杂，同时集合类的实现和遍历代码的实现，是两个人开发的
         // 成本就很高了，大家又要协调，又要改动
         //简单来说，这样的代码可扩展性可维护性，很差

    }
}
