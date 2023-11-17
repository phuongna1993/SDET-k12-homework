package lab06;

import java.util.Scanner;

public class Lab6_03 {
    /*
     * String myStr = "100 minutes";
     * NOT using REGEX, extract digit character from that String
     * Expected output: "100".
     * EX: "12345nabc678" -> "12345678"
     */
    public static void main(String[] args) {

        // Nhap tu ban phim
        Scanner newString = new Scanner(System.in);
        System.out.println("Please input random String:");
        String inputString = newString.nextLine();

        //Tach so va chu
        StringBuilder digitSring = new StringBuilder();
        char[] charArr = inputString.toCharArray();
        for (char character : charArr) {
            if (Character.isDigit(character))
                digitSring.append(character);
        }
        System.out.println(digitSring);
    }
}
