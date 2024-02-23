import controller.Controller;
import model.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new ComplexNumber(2, 4),
                new ComplexNumber(4, 2));
        controller.start();
    }
}
