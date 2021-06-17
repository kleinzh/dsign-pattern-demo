package com.klein.designpattern.adapter;

import com.klein.designpattern.adapter.impl.NewInterfaceImpl;
import com.klein.designpattern.adapter.impl.OldInterfaceImpl;

/**
 * @author Klein
 * @Classname WithOutAdapterDemo
 * @Description 未使用适配器模式下的使用
 * @Date 2021-06-17 10:42
 * @Created by Klein
 */
public class WithOutAdapterDemo {

    public static void main(String[] args) {
        OldInterface oldInterface=new OldInterfaceImpl();

        NewInterface newInterface=new NewInterfaceImpl();

        oldInterface.oldExecute();

        newInterface.newExecute();

        // 如果不用任何设计模式，我们的问题会在哪儿呢
        // 问题其实很明显，就是说，我们的新代码中，融合了新老两套接口
        // 首先如果我们这么干的话就会导致整体代码有点恶心，面向的是规范和风格完全不同的两套接口，你理解和维护的成本增加了
        // 其实，假如说，你现在都不给你选择使用老版本接口的机会了，直接强制性公司规范要求按照
        //新版本接口走，你老版本接口的实现类，就没办法用了啊
        // 难道还要基于新版本的接口重写一套么
    }
}
