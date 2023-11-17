package lab04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab4_01 {
    /*
    * Lab 4: Create a simple menu with 4 options:
    * Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
    * After that, have a menu (You can use while loop) to have below options
    * =====MENU======
    * 1. Print all numbers
    * 2. Print maximum value
    * 3. Print minimum value
    * 4. Search number
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList();

        int inputNum;
        for(int i = 0; i <= 5; ++i) {
            inputNum = (int)Math.round(Math.random() * 1000.0);
            myList.add(inputNum);
        }

        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your number:");

        Scanner scanner2;
        for(inputNum = scanner.nextInt(); inputNum <= 4; inputNum = scanner2.nextInt()) {
            int n;
            switch (inputNum) {
                case 1:
                    System.out.println("Selected function is: 1. Print all numbers");
                    System.out.println(myList);
                    break;
                case 2:
                    System.out.println("Selected function is: 2. Print maximum value");
                    int maxNumber = (Integer)myList.get(0);
                    Iterator var11 = myList.iterator();

                    while (var11.hasNext()) {
                        int inputnumber  = (Integer)var11.next();
                        if (maxNumber < inputnumber) {
                            maxNumber = inputnumber;
                        }
                    }

                    System.out.println("Maximum value is " + maxNumber);
                    break;
                case 3:
                    System.out.println("Selected function is: 3. Print minimum value");
                    int minNumber = (Integer)myList.get(0);
                    Iterator var6 = myList.iterator();

                    while(var6.hasNext()) {
                        n = (Integer)var6.next();
                        if (minNumber > n) {
                            minNumber = n;
                        }
                    }

                    System.out.println("Minimum value is " + minNumber);
                    break;
                case 4:
                    System.out.println("Selected function is: 4. Search number");
                    System.out.println("Please input a integer number to search: ");
                    new Scanner(System.in);
                    n = scanner.nextInt();
                    int numberIndex = myList.indexOf(n);
                    if (numberIndex < 0) {
                        System.out.println("Your number input not exist");
                    } else {
                        System.out.println("Your number input exist on index  [" + numberIndex + "]");
                    }
            }

            scanner2 = new Scanner(System.in);
            System.out.println("Please input your number:");
        }

    }
}
