package com.zemise.Builder_Pattern.demo_02;

/**
 * @Author zemise_
 * @Date 2023/5/25
 * @Description 尝试复写Lombok的@builder注解，了解原理
 */
public class Option {
    private String apiKey;
    private int speed;

    private Option(String apiKey, int speed) {
        this.apiKey = apiKey;
        this.speed = speed;
    }

    public String getApiKey() {
        return apiKey;
    }

    public int getSpeed() {
        return speed;
    }


    public static class Builder {
        private String apiKey = "001a5b2b";
        private int speed = 50;

        public Builder() {
        }

        // 其实这个建造者模式，重点在此处类似于setter方法的返回this，其实是返回的构建器本身
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Option build() {
            return new Option(apiKey, speed);
        }
    }
}
