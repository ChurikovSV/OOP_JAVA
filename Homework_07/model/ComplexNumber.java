package model;

public class ComplexNumber {
    private double imaginary;
    private double valid;

    public ComplexNumber(double imaginary, double valid) {
        this.imaginary = imaginary;
        this.valid = valid;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getValid() {
        return valid;
    }

    @Override
    public String toString() {
        if(imaginary < 0){
            return "{" + valid + imaginary +
                    " * i" +
                    '}';
        } else{
            return "{" + valid + " + "
                    + imaginary +
                    " * i" +
                    '}';
        }

    }
}
