package com.zemise.Lombok.Data;

/**
 * @Author Zemise_
 * @Date 2023/5/26
 * @Description
 */
public class TestPerson {
    public static void main(String[] args) {
        Person personA = new Person("无Lombok注释");
        personA.setName("无Lombok");

        UseDataPerson personB = new UseDataPerson();
        personB.setName("Lombok注释");
        System.out.println(personB.getName());
    }
}
