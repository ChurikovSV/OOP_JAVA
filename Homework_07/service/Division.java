package service;


import model.ComplexNumber;

public class Division {
    private Loggable loggable = new ConsoleLogger();
    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2){
        loggable.log(" Операция деления");
        ComplexNumber complexNumber = new ComplexNumber(
                (num2.getValid() * num1.getImaginary() -
                        num1.getValid() * num2.getImaginary()) /
                        (num2.getValid() * num2.getValid() +
                                num2.getImaginary() * num2.getImaginary()),
                (num1.getValid() * num2.getValid() +
                        num1.getImaginary() * num2.getImaginary()) /
                        (num2.getValid() * num2.getValid() +
                                num2.getImaginary() * num2.getImaginary()));
        return complexNumber;

    }
}
