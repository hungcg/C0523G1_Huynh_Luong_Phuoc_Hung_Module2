package ss17_binaryfile_serialization.excercise.productbinaryfile.model;

import java.io.Serializable;

public class Product implements Serializable,Comparable {
    private int id;
    private String name;
    private  int price;
    private String supplier;
    private String status;

    public Product(){

    }

    public Product(int id, String name, int price, String supplier, String status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfoToCSV(){
        return id+","+name+","+price+","+supplier+","+status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", supplier='" + supplier + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
