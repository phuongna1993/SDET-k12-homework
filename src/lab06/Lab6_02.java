package lab06;

import java.util.Scanner;

public class Lab6_02 {

    /*
     * String myPassword = "password123";
     * Allow user to input maximum 3 times
     */

    public static void main(String[] args) {
        int inputTime = 0;
        do {
            Scanner Nhaplieu = new Scanner(System.in);
            System.out.println("Please input your password: ");
            String passwordInput = Nhaplieu.nextLine();
            if (passwordInput.equals("password123")) {
                System.out.println("Your password match!");
                break;
            }
            else System.out.println("Your password wrong!");
            inputTime++;

        } while (inputTime < 3);
        if (inputTime == 3) {
            System.out.println("Better luck next time!");
        }
    }
}
