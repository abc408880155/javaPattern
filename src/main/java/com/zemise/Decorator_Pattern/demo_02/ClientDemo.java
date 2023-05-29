package com.zemise.Decorator_Pattern.demo_02;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description
 */
public class ClientDemo {
    public static void main(String[] args) {
        Car car = new Benz();

        // 对奔驰车进行装饰
        CarDecorator carDecorator = new ConcreteCarDecorator(car);

        carDecorator.show();
    }
}
