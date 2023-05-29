package com.zemise.Decorator_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description 装饰Decorator
 */
public abstract class Decorator implements Component{
    private Component component = null;
    public Decorator(Component component){
        this.component = component;
    }

    public void operation() {
        this.component.operation();
    }
}
