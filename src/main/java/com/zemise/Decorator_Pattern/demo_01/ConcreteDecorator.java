package com.zemise.Decorator_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description 具体装饰ConcreteDecorator
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }

    //定义自己的方法
    private void method(){
        System.out.println("修饰");
    }

    //重写operation方法
    public void operation(){
        this.method();
        super.operation();
    }
}
