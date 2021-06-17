package com.klein.designpattern.adapter;

import com.klein.designpattern.adapter.impl.NewInterfaceImpl;
import com.klein.designpattern.adapter.impl.OldInterfaceImpl;

/**
 * @author Klein
 * @Classname AdapterDemo
 * @Description 适配器模式
 * @Date 2021-06-17 10:46
 * @Created by Klein
 */
public class AdapterDemo {

    public static void main(String[] args) {
        NewInterface oldObject=new NewInterfaceAdapter(new OldInterfaceImpl());

        NewInterface newObject=new NewInterfaceImpl();

        oldObject.newExecute();
        newObject.newExecute();

        //适配器模式
        //就是你手上有新老两接口和一个老接口的实现类
        // 但是你现在系统中要面向新接口来开发，老接口的实现类就不能直接使用了，不能直接面向老接口来开发
        // 开发一个老接口到新接口的一个适配器
        // 适配器实现了新接口，但是适配器持有老接口实现类的引用
        //适配器的新接口方法的实现，基于老接口的实现类的老方法的实现即可
        //对于调用方而言，只要使用适配器来开发即可，就可以通过面向新接口来开发，底层使用老接口实现类
    }
}
