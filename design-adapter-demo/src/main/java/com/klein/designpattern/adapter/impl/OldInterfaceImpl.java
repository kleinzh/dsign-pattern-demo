package com.klein.designpattern.adapter.impl;

import com.klein.designpattern.adapter.OldInterface;

/**
 * @author Klein
 * @Classname OldInterfaceImpl
 * @Description 老版本接口实现类
 * @Date 2021-06-17 10:37
 * @Created by Klein
 */
public class OldInterfaceImpl implements OldInterface  {

    @Override
    public void oldExecute() {
        System.out.println("老版本接口实现类");
    }
}
