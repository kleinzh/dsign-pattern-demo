package com.klein.designpattern.iterator.Iterator;

/**
 * @author Klein
 * @Classname Aggregate
 * @Description 代表了一个集合类
 * @Date 2021-06-17 9:51
 * @Created by Klein
 */
public interface Aggregate {

    /**
     * 获取集合的迭代器
     * @return
     */
    Iterator iterator();
}
