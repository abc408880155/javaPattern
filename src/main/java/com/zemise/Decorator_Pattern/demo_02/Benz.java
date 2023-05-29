package com.zemise.Decorator_Pattern.demo_02;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description
 */

//奔驰车（裸车，需要装饰）
public class Benz implements Car{

    @Override
    public void show() {
        System.out.println("奔驰车的颜色默认是黑色");
    }
}
