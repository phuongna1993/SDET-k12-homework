package lab02;

import java.util.Scanner;

public class Lab2_02 {
    public static void main(String[] args) {

        //Nhap tu ban phim
        Scanner yourNumber = new Scanner(System.in);
        System.out.println("Moi ban nhap so nguyen:");
        Integer inputNumber = yourNumber.nextInt();

        // So sanh
        if (inputNumber % 2 == 0)
            System.out.println("Day la so chan");
        else System.out.println("Day la so le");
    }
}
