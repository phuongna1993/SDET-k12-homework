package lab06;

import java.util.Scanner;

public class Lab6_04 {

    /*
     * String url = "https://google.com";
     * Check http OR https; domain name, .com OR .net
     */

    public static void main(String[] args) {

        //Nhap tu ban phim
        Scanner Nhaplieu = new Scanner(System.in);
        System.out.println("Moi ban nhap URL");
        String url = Nhaplieu.nextLine();
        url = url.trim();

        //Kiem tra
        if (url.contains("https")) {
            System.out.println("URL cua ban bat dau bang https");
        } else {
            System.out.println("URL cua ban khong bat dau bang https");
        }
        if (url.contains(".com")) {
            System.out.println("Domain cua ban la .com");
        } else {
            System.out.println("Domain cua ban khong phai la .com");
        }
    }
}
