package org.example.proxy.dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname ProxyFactory
 * @Description 代理对象工厂：生成代理对象的
 * PS: JDK动态代理要求委托对象必须实现接口（newProxyInstance时候必须传递委托对象实现了哪些接口以便于我去代理这些接口object.getClass().getInterfaces()），
 *     CGLIB动态代理,不需要一定要实现接口(增强时候不调用呗)
 * @Date 2021-04-04 10:03
 * @Created by Klein
 */
public class ProxyFactory {

    private ProxyFactory() {
    }

    private static ProxyFactory proxyFactory = new ProxyFactory();

    public static ProxyFactory getInstance() {
        return proxyFactory;
    }

    /**
     * 使用java得jdk代理实现生成代理对象
     * @param object 委托对象
     * @return
     */
    public Object getJdkProxy(Object object) {
        //loader：类加载器
        //interfaces：实现代理得哪些接口
        //InvocationHandler:增强得逻辑
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result=null;

                        System.out.println("JDK 中介(代理)收取服务费1000");
                        result=method.invoke(object,args);
                        System.out.println("客户信息卖了100块");

                        return result;
                    }
                });
    }

    /**
     * 使用cglib动态代理生成代理对象
      * @param object 委托对象
     * @return
     */
    public Object getCglibProxy(Object object) {
        return Enhancer.create(object.getClass(),new MethodInterceptor() {

            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
               Object result=null;
                System.out.println("Cglib 中介(代理)收取服务费1000");
                result=method.invoke(object,objects);
                System.out.println("客户信息卖了100块");
                return result;
            }
        });
    }


}
