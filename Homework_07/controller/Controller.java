package controller;


import model.ComplexNumber;
import service.CalculateFactory;
import view.View;


public class Controller {
    private ComplexNumber num1;
    private ComplexNumber num2;
    private CalculateFactory calculateFactory = new CalculateFactory();
    private View view = new View();

    public Controller(ComplexNumber num1, ComplexNumber num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void start(){
        ComplexNumber res1 = calculateFactory.calculate(num1, num2, '+');
        System.out.println(num1 + " + " + num2 + " = ");
        view.printComplexNumber(res1);
        ComplexNumber res2 = calculateFactory.calculate(num1, num2, '-');
        System.out.println(num1 + " - " + num2 + " = ");
        view.printComplexNumber(res2);
        ComplexNumber res3 = calculateFactory.calculate(num1, num2, '/');
        System.out.println(num1 + " / " + num2 + " = ");
        view.printComplexNumber(res3);
        ComplexNumber res4 = calculateFactory.calculate(num1, num2, '*');
        System.out.println(num1 + " * " + num2 + " = ");
        view.printComplexNumber(res4);



    }

}
