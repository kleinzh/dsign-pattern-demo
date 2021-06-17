package com.klein.proxy.staticproxy;

/**
 * @Classname RentingHouseProxy
 * @Description TODO
 * @Date 2021-04-04 9:52
 * @Created by Klein
 */
public class RentingHouseProxy implements IRentingHouse {

    private IRentingHouse rentingHouse;

    public RentingHouseProxy(IRentingHouse rentingHouse) {
        this.rentingHouse = rentingHouse;
    }

    @Override
    public void rentHosue() {
        System.out.println("中介(代理)收取服务费1000");
        rentingHouse.rentHosue();
        System.out.println("客户信息卖了100块");
    }
}
