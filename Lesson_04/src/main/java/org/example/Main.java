package org.example;
public class Main {
    public static void main(String[] args) {
        SimpleBox intbox1 = new SimpleBox(10);
        SimpleBox intbox2 = new SimpleBox(20);
        int sum = (Integer) intbox1.getObj() + (Integer) intbox2.getObj();
        System.out.println(sum);
        intbox1.setObj("java");
        int sum2 = 0;
        if (intbox2.getObj() instanceof Integer && intbox1.getObj() instanceof Integer){
            sum2 = (Integer) intbox1.getObj() + (Integer) intbox2.getObj();
        }
        System.out.println(sum2);

        GenBox<Integer> gen1= new GenBox<>(10);
        GenBox<Integer> gen2= new GenBox<>(20);
        int sum3 = gen2.getObj() + gen1.getObj();
        System.out.println(sum3);

        BoxWithNumber <Integer> nums= new BoxWithNumber<>();


    }
}