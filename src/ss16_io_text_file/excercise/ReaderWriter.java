package ss16_io_text_file.excercise;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ReaderWriter {

    public static final String fileRead = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\sss16_io_text_file\\excercise\\source.txt";
    public static final String fileWirte = "D:\\C0523G1_Huynh_Luong_Phuoc_Hung_Module2\\src\\sss16_io_text_file\\excercise\\target .txt";

    public static String readFile(){
        String result = "";
        File fileRead1 = new File(fileRead);
        File fileWirter1 = new File(fileWirte);

        try {
            if (!fileRead1.exists()) {
                throw new FileNotFoundException();
            }
            if (!fileWirter1.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(fileRead1);
            FileWriter fileWriter = new FileWriter(fileWirter1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while ((result = bufferedReader.readLine()) != null){
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args) {
        readFile();
    }
}
