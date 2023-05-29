package com.zemise.Bridge_Pattern;

/**
 * @Author Zemise_
 * @Date 2023/5/29
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor imp = new ComcreteImplementor();

        // 定义一个抽象化角色
        Abstraction abs = new RefineAbstraction(imp);

        // 执行
        abs.operation();
    }
}
