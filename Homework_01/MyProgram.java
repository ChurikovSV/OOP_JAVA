package homework;

import java.util.Arrays;
import java.util.HashMap;

public class MyProgram {

    public static void main(String[] args) {

        // создание продуктов
        Product product001 = new Product("Конфета", 100.5, 3);
        Product product002 = new Product("Томат", 56.9, 4);
        Product product003 = new Product("Хлеб", 26.3, 5);
        Product product004 = new Product("Шоколад", 56, 5);
        Product product005 = new Product("Сосиски", 560, 5);
        Product product006 = new Product("Мясо", 800, 4);
        Product product007 = new Product("Батат", 205.6, 5);

        // новые категории
        System.out.println("В нашем магазине содержатся следующие товары: ");
        Category sweetCategory = new Category("Сладкое", Arrays.asList(product001, product004));
        Category vegetablesCategory = new Category("Овощи", Arrays.asList(product002, product006));
        Category breadCategory = new Category("Хлебобулочные изделия", Arrays.asList(product003));
        Category meatCtegory = new Category("Мясные изделия", Arrays.asList(product005, product006));
        System.out.println(sweetCategory + "\n" + vegetablesCategory + "\n" + breadCategory + "\n" + meatCtegory);

        // создание корзины магазина и добалвение в нее продуктов
        Basket magazineBasket = new Basket(product001, 3);
        magazineBasket.put(product002, 3);
        magazineBasket.put(product003, 3);
        magazineBasket.put(product004, 3);
        magazineBasket.put(product005, 3);
        magazineBasket.put(product006, 3);
        magazineBasket.put(product007, 3);

        // создание - пользоваеть сам магазин
        User magazine = new User("magazine", "qwerty", magazineBasket);

        // создание разных покупателей
        System.out.println();
        User user1 = new User("Сережа", "111", new Basket(product001, 1));
        System.out.println("первый покупатель: " + user1.getLogin());
        magazine.buy(user1);

        System.out.println();
        User user2 = new User("Женя", "222", new Basket(product004, 234234));
        System.out.println("второй покупатель: " + user2.getLogin());
        magazine.buy(user2);

        System.out.println();
        User user3 = new User("Дима", "333", new Basket(product001, -3));
        System.out.println("третий покупатель: " + user3.getLogin());
        magazine.buy(user3);

    }

}
