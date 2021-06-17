package com.klein.designpattern.adapter.impl;

import com.klein.designpattern.adapter.NewInterface;

/**
 * @author Klein
 * @Classname NewInterfaceImpl
 * @Description 新版本接口实现类
 * @Date 2021-06-17 10:39
 * @Created by Klein
 */
public class NewInterfaceImpl implements NewInterface {
    @Override
    public void newExecute() {
        System.out.println("新版本接口实现类");
    }
}
