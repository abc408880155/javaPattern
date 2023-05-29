package com.zemise.Builder_Pattern.demo_02;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description
 */
public class testOption {
    public static void main(String[] args) {
        Option option = new Option.Builder()
                .apiKey("1234456")
                .speed(50)
                .build();

        System.out.println(option.getSpeed());
    }
}
