package com.sda.ClassInterface_home.CarEngine;

public class Car {
    private String name;
    private String type;
    private Engine engine;

    public class Engine {
        private String engineType;

        public void setEngineType() {
            if (getType() == "economy") {
                this.engineType = "diesel";
            } else if (getType() == "luxury") {
                this.engineType = "electric";
            } else {
                this.engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        Engine engine1 = new Engine();
        engine1.setEngineType();
        this.engine = engine1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }
}
