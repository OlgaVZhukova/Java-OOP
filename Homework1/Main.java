package Homework1;


import java.util.ArrayList;
import Homework1.Product;
import Homework1.ChildClasses.*;
import Homework1.SubClasses.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> myProduct = new ArrayList<>();
        myProduct.add(new Bread("Бородинский", 1.02, 10,"шт", "08.03.2023", "Первый сорт"));
        myProduct.add(new Diapers("Pampers", 250, 48, "шт", 2, "5", 10, 15, "Ночные"));
        myProduct.add(new Eggs("Окское", 15, 10, "шт", "15.03.2023", 24));
        myProduct.add(new Masks("Маски", 22, 100, "шт", 5));
        myProduct.add(new Milk("Вкуснотеево", 100, 1, "литр", 3.2, "31.03.2023"));
        myProduct.add(new Pacifier("Соска", 25, 1, "шт"));
        myProduct.add(new Lemonade("Дюшес", 10, 1, "литр", 1));
        myProduct.add(new ToiletPapper("Papia", 60, 8, "шт", 24, 3));

        for(Product product: myProduct){
            Program.getProductInfo(product);
            System.out.println();
        }
    }
}
