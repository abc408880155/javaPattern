package com.zemise.Builder_Pattern.demo_03;

import com.zemise.Builder_Pattern.demo_02.Option;

/**
 * @Author zemise_
 * @Date 2023/5/25
 * @Description 实际遇到的一种建造者模式的写法
 */
public class XunOption {
    private String apiKey;
    private int speed;

    private XunOption(String apiKey, int speed) {
        this.apiKey = apiKey;
        this.speed = speed;
    }

    public String getApiKey() {
        return apiKey;
    }

    public int getSpeed() {
        return speed;
    }


    public static XunOption.Builder Builder() {
        return new XunOption.Builder();
    }
    
    public static class Builder {
        private String apiKey = "001a5b2b";
        private int speed = 50;

        private Builder() {
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public XunOption build() {
            return new XunOption(apiKey, speed);
        }
    }
}
