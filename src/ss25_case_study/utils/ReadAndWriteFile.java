package ss25_case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    //    public static void writeProduct(ArrayList<Product> product) throws IOException {
//        FileOutputStream fos = new FileOutputStream(FILE_PATH);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(product);
//        oos.close();
//        fos.close();
//    }
//
//    public static ArrayList<Product> readProduct(String file) throws IOException, ClassNotFoundException {
//        FileInputStream fis = new FileInputStream(file);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        ArrayList<Product> products = (ArrayList<Product>) ois.readObject();
//        ois.close();
//        fis.close();
//        return products;
//    }
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ProductRepo productRepo = new ProductRepo();
//        writeProduct(productRepo.displayAll());
//        ArrayList<Product> productArrayList = readProduct(FILE_PATH);
//        for (Product products: productArrayList) {
//            System.out.println(products);
//        }
//    }
    public static void writeFromFile(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<String> readFromFile(String filePath) {
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return stringList;
    }
}