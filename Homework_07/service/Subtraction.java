package service;


import model.ComplexNumber;

public class Subtraction extends Addition{
    private Loggable loggable = new ConsoleLogger();
    @Override
    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2){
        loggable.log(" Операция вычитания");
        ComplexNumber complexNumber = new ComplexNumber(num1.getImaginary() -
                num2.getImaginary(),
                num1.getValid() - num2.getValid());
        return complexNumber;
    }
}
