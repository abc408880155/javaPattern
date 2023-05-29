package com.zemise.Builder_Pattern.demo_01;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description 对建造者模式进行测试应用
 */
public class TestComputer {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        Computer t410 = director.construct410();
        System.out.println(t410);

        System.out.println("===================================");

        Computer x201 = director.constructX201();
        System.out.println(x201);
    }
}
