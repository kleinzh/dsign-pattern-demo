package com.klein.proxy.staticproxy;

/**
 * @author Klein
 * @Classname TestProxy
 * @Description TODO
 * @Date 2021-04-04 9:55
 * @Created by Klein
 */
public class TestProxy {

    public static void main(String[] args) {
        IRentingHouse rentingHouse=new RentingHouseImpl();

        RentingHouseProxy rentingHouseProxy=new RentingHouseProxy(rentingHouse);
        rentingHouseProxy.rentHosue();
    }
}
