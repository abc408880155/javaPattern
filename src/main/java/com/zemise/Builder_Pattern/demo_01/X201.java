package com.zemise.Builder_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description X201计算机，继承Computer抽象类
 */
public class X201 extends Computer {
    public X201() {
        this.setType("ThinkPad X201i");
    }

    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu()
                + "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk()
                + "\n显示器：\t" + this.getMonitor() + "\n操作系统：" + this.getOs();
    }
}
