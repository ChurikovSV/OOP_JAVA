package homework;

public class Product {
    private String name;

    private double price;
    private int rating;

    /**
     * @apiNote Создание класса товар
     * @param name   наименование товара
     * @param price  цена товара в рублях
     * @param rating рейтинг товара в диапазоне от 0 до 5
     */
    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    /**
     * @name - наименование товара класса Product
     */
    public String getName() {
        return name;
    }

    /**
     * @price цена товара класса Product
     */
    public double getPrice() {
        return price;
    }

    // Вывод на экран наименования товара, рейтинрга, цены, количества
    @Override
    public String toString() {
        return name + " (цена: " + price + ", рейтинг: " + rating + ")";
    }
}
