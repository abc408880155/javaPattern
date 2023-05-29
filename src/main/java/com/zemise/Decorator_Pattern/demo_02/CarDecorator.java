package com.zemise.Decorator_Pattern.demo_02;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description
 */

// 汽车装饰（抽象装饰）
public abstract class CarDecorator implements Car{
    private Car car = null;
    public CarDecorator(Car car){
        this.car= car;

    }

    @Override
    public void show() {
        this.car.show();
    }
}
