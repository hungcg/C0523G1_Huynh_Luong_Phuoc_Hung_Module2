package ss17_binaryfile_serialization.excercise.productbinaryfile.repository;

import ss17_binaryfile_serialization.excercise.productbinaryfile.model.Product;

import java.util.List;

public interface IProductRepo {

    List<Product> displayAll();
   void add(Product e);
    List<Product> search(String name);

}
