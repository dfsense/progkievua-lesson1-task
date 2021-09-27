package ua.kovalev;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Article article1 = new Article(new BigDecimal("23450"), new BigDecimal("7.350"), "Телевизор");
        Article article2 = new Article(new BigDecimal("7500"), new BigDecimal("0.250"), "Телефон");
        System.out.println("article1 = " + article1);
        System.out.println("article2 = " + article2);
    }
}
