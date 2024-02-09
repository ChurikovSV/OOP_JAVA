package homework;

import java.util.ArrayList;
import java.util.List;

public class Category {
    /**
     * @apiNote Это переменная содержит категорию товаров
     * @nameCategory Категории товаров
     */
    private String nameCategory;
    /**
     * @apiNote Эта переменная содержит массив товаров относящихся к определенной
     *          категории
     * @listOfProducts массив товаров относящихся к определенной категории товаров
     */
    private List<Product> listOfProducts;

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getList() {
        return listOfProducts;
    }

    public void setArrayList(ArrayList<Product> arrayList) {
        this.listOfProducts = arrayList;
    }

    /**
     * Создание категории товаров
     * 
     * @param nameCategory   название категории товаров
     * @param listOfProducts массив товаров в категории
     */
    public Category(String nameCategory, List<Product> listOfProducts) {
        this.nameCategory = nameCategory;
        this.listOfProducts = listOfProducts;
    }

    /**
     * Вывод на печать Названия категории товаров и товаров
     */
    @Override
    public String toString() {
        return "Категория: " + nameCategory +
                ", товары: " + listOfProducts;
    }

}
