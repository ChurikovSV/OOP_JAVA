package homework;

import java.util.Arrays;
import java.util.HashMap;

public class User {
    private String login;
    private String password;
    private Basket basket;

    /**
     * @param login    логин
     * @param password пароль
     * @param basket   содержимое корзины
     * @apiNote Создание пользователя - Магазин (используя логин, пароль,
     *          заполненную
     *          корзину для магазина)
     */
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    /**
     * Создание пользователя ФЛ или ЮЛ (используя логин, пароль)
     *
     * @param login    логин пользователя
     * @param password пароль пользователя
     */
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    /**
     * Просмотр содержимого корзины
     *
     * @return содержимое корзины
     */
    public Basket getBasket() {
        return basket;
    }

    public String getLogin() {
        return login;
    }

    /**
     * @param prod  название товара
     * @param count количество товара
     * @apiNote Функция добавляет токары в корзину покупателя
     */
    public void addBasketUser(Product prod, int count) {
        basket.put(prod, count);
    }

    /**
     * @return
     * @apiNote Измененый формат печати toString
     */
    @Override
    public String toString() {
        return "Ассортимент товара пользователя " + login +
                ", с паролем: ***********"
                + basket.getHashMApBasket() +
                '}';
    }

    /**
     * @apiNote функция покупки на кассе
     *          Покупатель добавляет товары в корзину, которые хочет купить и
     *          указывает их количество,
     *          Данная функцуия проверяет наличие товара в магазине, выводит
     *          оставшееся количество в магазине и количество приобретенных товаров
     *          покупателем
     * @param buyer покупатель класса User
     */
    public void buy(User buyer) {
        HashMap<Product, Integer> hashMagazine = this.getBasket().getHashMApBasket();
        HashMap<Product, Integer> hashBuyer = buyer.getBasket().getHashMApBasket();
        // тест
        System.out.println("Ассортимент в магазине в начале: ");
        System.out.println(hashMagazine);
        System.out.println("выбор Покупателя");
        System.out.println(hashBuyer);

        int countOfClient;
        int oldCountOfMagazine;
        int newCountInMagazine;
        System.out.println("start");
        for (Product prod : hashMagazine.keySet()) {
            // System.out.println(prod);
            if (hashBuyer.keySet().contains(prod)) {
                countOfClient = hashBuyer.get(prod);
                oldCountOfMagazine = hashMagazine.get(prod);
                if (countOfClient > oldCountOfMagazine) {
                    System.out.println("В нашем магазине нет достаточного количества " + prod);
                    countOfClient = oldCountOfMagazine;
                    newCountInMagazine = 0;
                    hashBuyer.put(prod, countOfClient);
                    hashMagazine.put(prod, newCountInMagazine);
                } else if (countOfClient < 0) {
                    hashBuyer.remove(prod);
                } else {
                    newCountInMagazine = oldCountOfMagazine - countOfClient;
                    hashMagazine.put(prod, newCountInMagazine);
                }
            }
        }
        System.out.println("Ассортимент в магазине в конце: ");
        System.out.println(hashMagazine);
        if (hashBuyer.isEmpty()) {
            System.out.println("Покупатель " + buyer.getLogin() + " ничего не купил!");
        } else {
            System.out.println("Покупатель " + buyer.getLogin() + " купил:");
            System.out.println(hashBuyer);
        }

    }
}
