package homework;

import java.util.HashMap;
import java.util.List;

public class Basket {
    /**
     * @hashMApBasket карта в формате hashMap
     */
    private HashMap<Product, Integer> hashMApBasket;

    private double sumOfProducts;

    /**
     * @apiNote Создание корзины путем добавления продукта
     * @param prod            наименование продукта
     * @param countOfProducts количество созданных продуктов
     */
    public Basket(Product prod, int countOfProducts) {
        HashMap<Product, Integer> hashMap = new HashMap<>();
        hashMap.put(prod, countOfProducts);
        this.hashMApBasket = hashMap;
    }

    public Basket(HashMap<Product, Integer> hashMap) {
        this.hashMApBasket = hashMap;
    }

    /**
     * @apiNote Создание пустой корзины
     */
    public Basket() {
        HashMap<Product, Integer> hashMap = new HashMap<>();
        this.hashMApBasket = hashMap;
    }

    /**
     * @apiNote Содержимое корзины
     * @return Возврат корзины в формате hashMap
     */
    public HashMap<Product, Integer> getHashMApBasket() {
        return hashMApBasket;
    }

    /**
     * @apiNote Измененый формат печати toString
     * @return
     */
    @Override
    public String toString() {
        return "Список товаров в корзине: " + hashMApBasket + "\n";
    }

    /**
     * Добавить товар в корзину
     * 
     * @param prod            наименование товара
     * @param countOfProducts количество товара
     */
    public void put(Product prod, int countOfProducts) {
        this.hashMApBasket.put(prod, countOfProducts);
    }

    /**
     * @apiNote проверка на заполненность корзины, если пуста возвращает true
     * @return boolean значение
     */
    public boolean basketIsEmpty() {
        return hashMApBasket.isEmpty();
    }

}
