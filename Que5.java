package Ifelse;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        if (year>999 && year<10000){
            if (year%400==0){
                System.out.println("Leap year ");
            }
            else {
                System.out.println("Not a leap year");
            }
        }
    }
}
