package com.zemise.Builder_Pattern.demo_04;

/**
 * @Author zemise_
 * @Date 2023/5/26
 * @Description 练习建造者模式
 */
public final class ComputerOption {
    private final String cpu;
    private final String name;

    private ComputerOption(String cpu, String name) {
        this.cpu = cpu;
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public String getName() {
        return name;
    }



    public static ComputerOption.Builder Builder(){
        return new ComputerOption.Builder();
    }

    public static class Builder {
        private String cpu = "Intel 12490";
        private String name = "Y400";

        private Builder() {
        }

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public ComputerOption build() {
            return new ComputerOption(cpu, name);
        }

    }
}
