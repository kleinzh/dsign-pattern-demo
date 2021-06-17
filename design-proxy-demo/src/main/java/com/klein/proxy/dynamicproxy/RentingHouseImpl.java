package com.klein.proxy.dynamicproxy;

/**
 * @author Klein
 * @Classname RentingHouseImpl
 * @Description 委托方（委托对象）
 * @Date 2021-04-04 9:58
 * @Created by Klein
 */
public class RentingHouseImpl implements IRentingHouse {

    @Override
    public void rentHosue() {
        System.out.println("我要租两室一厅得房子");
    }
}
