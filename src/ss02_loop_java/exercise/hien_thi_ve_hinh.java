package ss02_loop_java.exercise;

import java.util.Scanner;

public class hien_thi_ve_hinh {
    public static void main(String[] args) {

        System.out.println("ban muốn vẽ hình nào?");
        System.out.println("1. hình vuông");
        System.out.println("2. hình chữ nhật");
        System.out.println("3. hình tam giác");
        System.out.println("4. exit");
        Scanner draw = new Scanner(System.in);
        Integer number = draw.nextInt();
        switch (number){
            case 1 :
                System.out.println("nhập vào cạnh hình vuông");
                Scanner number2 =new Scanner(System.in);
                Integer height = number2.nextInt();
                for (int i = 1; i <3 ; i++) {
                    System.out.println("*");
                    for (int j = 1; j <=7 ; j++) {
                        System.out.println("*");


                    }


                };

        }



    }
}
