package lab02;

import java.util.Scanner;

public class Lab2_01 {
    /*
    * Get input from user about height(m) and weight(kg) then calculate BMI
    * Underweight = <18.5
    * Normal weight = 18.5 – 24.9
    * Overweight = 25–29.9
    * Obesity = BMI of 30 or greater
    * BMI = weight / (height x height)
     */
    public static void main(String[] args) {
        // Khai bao can nang tu ban phim

        Scanner weight = new Scanner(System.in);
        System.out.println("Nhap can nang cua ban (kg):");
        Float yourWeight = weight.nextFloat();

        // Khai bao chieu cao tu pban phim

        Scanner height = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua ban (m): ");
        Float yourHeight = height.nextFloat();

        // Tinh BMI

        Float myBMI = yourWeight/(yourHeight*yourHeight);
        System.out.println("Chi so BMI cua ban la "+ myBMI);

        // So sanh Underweight
        if (myBMI <= 18.5)
            System.out.println("underweight");

            // So sanh Normalweight
        else if (myBMI > 18.5 && myBMI <= 24.9)
            System.out.println("normal weight");

            // So sanh Overweight
        else if (myBMI >= 25 && myBMI <= 29.9)
            System.out.println("overweight");

            // So sanh Obesityweight
        else System.out.println("Obesity");
    }
}
