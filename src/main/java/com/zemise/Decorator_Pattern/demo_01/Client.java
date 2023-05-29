package com.zemise.Decorator_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description 应用装饰模式
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        //进行装饰
        component = new ConcreteDecorator(component);

        component.operation();
    }
}
