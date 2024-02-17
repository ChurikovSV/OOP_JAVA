import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 58, 999, 66));
        Calculator calculator = new Calculator();
        System.out.println("calculator = " + calculator.sum(array1));
        List<Double> arrays2 = new ArrayList<>(Arrays.asList(2.0, 4.0, 88.0));
        System.out.println("arrays = " + calculator.sum(arrays2));
        System.out.println("multy = " + calculator.multiplication(arrays2));
        System.out.println("del = " + calculator.division(arrays2));
        String str = "4.50";
        System.out.println(calculator.toBinaryString(str));

    }
}
