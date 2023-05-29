package com.zemise.Builder_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description 计算机ComputerBuilder接口
 */

// 计算机Builder
public interface ComputerBuilder {

    void buildCpu(); // 建造CPU

    void buildRam(); // 建造内存

    void buildHardDisk(); // 建造硬盘

    void buildGraphicCard();// 建造显卡

    void buildMonitor();// 建造显示器

    void buildOs(); // 建造操作系统

    Computer getResult(); // 得到建造好的计算机
}
