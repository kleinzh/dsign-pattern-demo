package com.klein.designpattern.iterator.Iterator;

/**
 * @author Klein
 * @Classname Iterator
 * @Description 定义一个我们自己的迭代器接口
 * @Date 2021-06-17 9:52
 * @Created by Klein
 */
public interface Iterator {

    /**
     * 集合是否有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 获取集合下一个元素对象
     * @return
     */
    Object next();
}
