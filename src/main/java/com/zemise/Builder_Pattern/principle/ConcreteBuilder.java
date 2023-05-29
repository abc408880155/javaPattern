package com.zemise.Builder_Pattern.principle;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description 具体建造者ConcreteBuilder实现Builder中的抽象方法
 */
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    // 设置产品零件
    public void setPart1() {
        // 为product安装部件1
    }

    public void setPart2() {
        // 为product安装部件2
    }

    public void setPart3() {
        // 为product安装部件3
    }
    // ....其他部件
    // 建造一个产品
    public Product builderProduct() {
        return product;
    }
}
