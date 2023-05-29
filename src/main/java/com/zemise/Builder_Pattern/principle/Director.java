package com.zemise.Builder_Pattern.principle;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    // 构造产品，负责调用各个零件建造方法
    public Product build() {
        builder.setPart1();
        builder.setPart2();
        builder.setPart3();
        // ....其他部件
        return builder.builderProduct();

    }
}
