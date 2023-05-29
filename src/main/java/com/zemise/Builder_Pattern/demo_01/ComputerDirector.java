package com.zemise.Builder_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description
 */

// 建造计算机的Director
public class ComputerDirector {
    ComputerBuilder builder;

    // 构造T410计算机
    public T410 construct410() {
        builder = new T410Builder();
        builder.buildCpu();
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildGraphicCard();
        builder.buildMonitor();
        builder.buildOs();

        return (T410) builder.getResult();
    }

    // 构造X201型计算机
    public X201 constructX201() {
        builder = new X201Builder();
        builder.buildCpu();
        builder.buildRam();
        builder.buildHardDisk();
        builder.buildMonitor();
        builder.buildOs();
        return (X201) builder.getResult();
    }
}
