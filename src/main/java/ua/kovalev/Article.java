package ua.kovalev;

import java.math.BigDecimal;

public class Article {
    private String description;
    private BigDecimal weight;
    private BigDecimal price;

    public Article() {
        super();
    }

    public Article(BigDecimal price, BigDecimal weight, String description) {
        super();
        this.price = price;
        this.weight = weight;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
