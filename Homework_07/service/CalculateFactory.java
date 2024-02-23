package service;


import model.ComplexNumber;

public class CalculateFactory {
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2, char symb){
        switch (symb){
            case '+':
                return new Addition().addition(num1, num2);
            case '-':
                return new Subtraction().addition(num1, num2);
            case '*':
                return new Multiplication().multiplication(num1, num2);
            case '/':
                return new Division().division(num1, num2);
            default:
                return new ComplexNumber(0, 0);
        }

    }

    public CalculateFactory() {
    }
}
