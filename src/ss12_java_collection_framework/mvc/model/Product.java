package ss12_java_collection_framework.mvc.model;

public class Product implements Comparable {
    private int id;
    private String name;
    private int price;

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int id, String name, int price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product[" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ']';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
