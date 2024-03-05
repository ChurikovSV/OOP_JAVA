package org.example;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Car car = new Car();
        human.drive(car);
        human.drive(car);
        human.stop();
        Bicycle bicycle = new Bicycle();
        human.drive(bicycle);
        human.stop();
        Kater kater = new Kater();
        human.drive(kater);
        human.stop();
    }
}
