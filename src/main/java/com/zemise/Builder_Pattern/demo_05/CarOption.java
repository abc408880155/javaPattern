package com.zemise.Builder_Pattern.demo_05;

import lombok.Builder;
import lombok.Data;
/**
 * @Author zemise_
 * @Date 2023/5/26
 * @Description 通过Lombok注释来使用建造者模式
 */
@Builder
@Data
public class CarOption {
    private String name;
    @Builder.Default
    private int passenger = 55;
}
