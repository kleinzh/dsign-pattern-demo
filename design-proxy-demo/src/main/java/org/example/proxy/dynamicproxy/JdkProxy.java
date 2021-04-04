package org.example.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author Klein
 * @Classname JdkProxy
 * @Description JDK动态代理
 * @Date 2021-04-04 10:07
 * @Created by Klein
 */
public class JdkProxy {
    public static void main(String[] args) {
        /**
         * 委托对象---委托方
         */
        IRentingHouse rentingHouse = new RentingHouseImpl();

        IRentingHouse rentingHouseProxy=(IRentingHouse)ProxyFactory.getInstance().getJdkProxy(rentingHouse);

        rentingHouseProxy.rentHosue();
    }
}
