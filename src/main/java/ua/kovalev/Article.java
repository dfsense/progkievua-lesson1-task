package ua.kovalev;

import java.math.BigDecimal;

public class Article {
    private String description;
    private BigDecimal weight;
    private BigDecimal price;

    public Article(BigDecimal price, BigDecimal weight, String description) {
        this.price = price;
        this.weight = weight;
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Article{" +
                "description='" + description + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
