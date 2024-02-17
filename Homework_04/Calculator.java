import java.util.List;

public class Calculator {

    public double sum(List<? extends Number> array) {
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double minus(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        if (array.size() == 1)
            return result;
        if (array.size() > 1) {
            for (int i = 1; i < array.size(); i++) {
                result -= array.get(i).doubleValue();
            }
        }
        return result;
    }

    public double multiplication(List<? extends Number> array) {
        double result = 1.0;
        for (int i = 0; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        if (array.size() == 1)
            return result;
        if (array.size() > 1) {
            for (int i = 1; i < array.size(); i++) {
                result /= array.get(i).doubleValue();
            }
        }
        return result;
    }

    public String toBinaryString(String str) {
        int num = stringIntoInteger(str);
        return Integer.toString(num, 2);
    }

    private Integer stringIntoInteger(String string) {
        if (string.contains(".")) {
            string = string.substring(0, string.indexOf('.'));
            return Integer.valueOf(string);
        } else {
            return Integer.valueOf(string);
        }
    }

}
