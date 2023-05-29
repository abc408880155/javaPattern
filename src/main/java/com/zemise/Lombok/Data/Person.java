package com.zemise.Lombok.Data;

import java.util.List;

/**
 * @Author Zemise_
 * @Date 2023/5/26
 * @Description
 */
public class Person {
    private String name;
    private int age;
    private Double price;
    private List<String> tags;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", tags=" + tags +
                '}';
    }
}
