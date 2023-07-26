package ss17_binaryfile_serialization.excercise.productbinaryfile.repository;

import ss17_binaryfile_serialization.excercise.productbinaryfile.model.Product;
import ss17_binaryfile_serialization.excercise.productbinaryfile.util.ReadAndWriteFile;

import java.util.ArrayList;

import java.util.List;

public class ProductRepo implements IProductRepo {
    private static final String FILE_PATH = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\ss17_binaryfile_serialization\\excercise\\productbinaryfile\\data\\product.csv";


    @Override
    public List<Product> displayAll() {
        List<Product> productList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readProduct(FILE_PATH);
        String array[] = null;
        for (String string : stringList) {
            array = string.split(",");
            Product product = new Product(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], array[4]);
            productList.add(product);
        }
        return productList;
    }


    @Override
    public void add(Product e) {
        List<String> stringList = new ArrayList<>();
        stringList.add(e.getInfoToCSV());
        ReadAndWriteFile.writeProduct(FILE_PATH, stringList, true);
    }

    @Override
    public void search(String name) {
        List<Product> productList = this.displayAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                System.out.println(productList.get(i));
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Product product : productList) {
            stringList.add(product.getInfoToCSV());

        }
        ReadAndWriteFile.writeProduct(FILE_PATH, stringList, false);
    }

}


