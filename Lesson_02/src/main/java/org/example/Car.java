package org.example;

public class Car implements Transport{

    @Override
    public void start() {
        System.out.println(" машина поехала!");
    }

    @Override
    public void stop() {
        System.out.println(" машина остановилась!");
    }
}
