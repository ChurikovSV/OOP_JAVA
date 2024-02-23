package service;


import model.ComplexNumber;

public class Multiplication {
    private Loggable loggable = new ConsoleLogger();
    public ComplexNumber multiplication(ComplexNumber num1, ComplexNumber num2){
        loggable.log(" Операция умножения");
        ComplexNumber complexNumber = new ComplexNumber(
                num1.getValid() * num2.getImaginary() +
                        num1.getImaginary() * num2.getValid(),
                num1.getValid() * num2.getValid() -
                        num1.getImaginary() * num2.getImaginary());
        return complexNumber;
    }
}
