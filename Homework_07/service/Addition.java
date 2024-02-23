package service;


import model.ComplexNumber;

public class Addition {
    private Loggable loggable = new ConsoleLogger();
    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2){
        loggable.log(" Операция сложения");
        ComplexNumber complexNumber = new ComplexNumber(num2.getImaginary() +
                num1.getImaginary(),
                num1.getValid() + num2.getValid());
        return complexNumber;
    }
}
