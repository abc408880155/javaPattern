package com.zemise.Builder_Pattern.demo_05;

/**
 * @Author zemise_
 * @Date 2023/5/26
 * @Description
 */
public class TestCarOption {
    public static void main(String[] args) {
        CarOption bmw = CarOption.builder().name("BMW").passenger(5).build();
        CarOption bmw2 = CarOption.builder().name("BMW").build();

        System.out.println(bmw.getName());
        System.out.println(bmw2.getPassenger());

    }
}
