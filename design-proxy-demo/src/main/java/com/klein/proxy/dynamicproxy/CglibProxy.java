package com.klein.proxy.dynamicproxy;

/**
 * @Classname CglibProxy
 * @Description Cglib代理对象
 * @Date 2021-04-04 10:21
 * @Created by Klein
 */
public class CglibProxy {

    public static void main(String[] args) {
        /**
         * 委托对象---委托方
         */
        IRentingHouse rentingHouse = new RentingHouseImpl();

        // 获取rentingHouse对象的代理对象，
        // Enhancer类似于JDK动态代理中的Proxy
        // 通过实现接口MethodInterceptor能够对各个方法进行拦截增强，类似于JDK动态代理中的InvocationHandler
        IRentingHouse rentingHouseProxy=(IRentingHouse)ProxyFactory.getInstance().getCglibProxy(rentingHouse);

        rentingHouseProxy.rentHosue();
    }
}
