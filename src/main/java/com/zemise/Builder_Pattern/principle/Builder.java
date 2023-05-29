package com.zemise.Builder_Pattern.principle;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description 抽象建造者Builder
 */
public abstract class Builder {
    // 设置产品的不同部分，以获得不同的产品
    public abstract void setPart1();
    public abstract void setPart2();
    public abstract void setPart3();
    // ....其他部件
    // 建造产品
    public abstract Product builderProduct();

}
