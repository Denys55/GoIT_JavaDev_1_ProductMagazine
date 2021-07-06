package ProductInShop;

public class Product {

    private String name;
    private Double regularPrice;
    private Integer saleCount;
    private Double salePrice;

    public Product(String name, Double regularPrice, Integer saleCount, Double salePrice) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.saleCount = saleCount;
        this.salePrice = salePrice;
    }

    public Product(String name, double regularPrice) {
        this(name, regularPrice, 1, regularPrice);
    }

    public double getPriceByCount(long count) {
        if (count <= 0) {
            throw new RuntimeException("Ты не выбрал никого продукта");
        }
        if (count < saleCount) {
            return count * regularPrice;
        }
        else {
            return (count / saleCount) * salePrice + (count % saleCount) * regularPrice;
        }
    }

    public String getName() {
        return name;
    }

    public Double getRegularPrice() {
        return regularPrice;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public Double getSalePrice() {
        return salePrice;
    }
}
