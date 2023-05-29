package com.zemise.Lombok.Data;

import lombok.Data;

import java.util.List;

/**
 * @Author Zemise_
 * @Date 2023/5/26
 * @Description
 */

@Data
public class UseDataPerson {
    private String name;
    private int age;
    private Double price;
    private List<String> tags;
}

