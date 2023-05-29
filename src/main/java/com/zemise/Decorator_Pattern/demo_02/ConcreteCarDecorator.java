package com.zemise.Decorator_Pattern.demo_02;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description
 */

// 具体汽车装饰
public class ConcreteCarDecorator extends CarDecorator{
    public ConcreteCarDecorator(Car car) {
        super(car);
    }

    // 给车进行彩绘
    private void print(){
        System.out.println("在车尾绘制“新手”字样，颜色是紫气东来");
    }

    // 给车安装GPS

    private void setGPS(){
        System.out.println("安装GPS定位导航系统");
    }

    @Override
    public void show() {
        super.show();
        this.print();
        this.setGPS();

    }
}
