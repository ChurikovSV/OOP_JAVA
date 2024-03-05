package org.example;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        System.out.println("Кот: " + catOne.getName() +
                "\n имеет цвет: "+catOne.getColor() +
                "\n возраста: "+ catOne.getAge());

        Vector vectorOne = new Vector(3,3,3);
        Vector vectorTwo = new Vector(3,3,3);
        Vector vectorMulti = new Vector(3, 3,3 );
        System.out.println(vectorOne);
        System.out.println("Длина вектора " + vectorOne.length());
        System.out.println("vectorOne.projectScalar(vectorTwo) = " + vectorOne.projectScalar(vectorTwo));
        System.out.println("vectorMulti.vectorMultiplication(vectorTwo) = " + vectorMulti.vectorMultiplication(vectorTwo));

        System.out.println("vectorOne.cos(vectorTwo) = " + vectorOne.cos(vectorTwo));

    }
}