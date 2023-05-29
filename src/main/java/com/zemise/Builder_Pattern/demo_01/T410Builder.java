package com.zemise.Builder_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description
 */
public class T410Builder implements ComputerBuilder {
    private T410 computer = new T410();

    @Override
    public void buildCpu() {
        computer.setCpu("i5-450");
    }

    @Override
    public void buildRam() {
        computer.setRam("4GB 1333MHz");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("500GM 7200转");
    }

    @Override
    public void buildGraphicCard() {
        computer.setGraphicCard("AMD 6600");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("27英寸 1980*1080");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 11");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
