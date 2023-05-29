package com.zemise.Builder_Pattern.demo_03;

/**
 * @Author Zemise_
 * @Date 2023/5/25
 * @Description
 */
public class testXunOption {
    public static void main(String[] args) {
        XunOption xunOption = XunOption.Builder()
                .apiKey("测试001")
                .build();

        System.out.println(xunOption.getApiKey());
    }
}
