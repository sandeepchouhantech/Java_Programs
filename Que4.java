package Ifelse;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>9 && num<100){
            System.out.println("2 digits");
        }
        else if (num>99 && num<1000){
            System.out.println("3 digits");
        }
        else if (num>999 && num<10000){
            System.out.println("4 digits");
        }
        else if (num>9999 && num<100000){
            System.out.println("5 digits");
        }
        else if (num>99999 && num<1000000){
            System.out.println("6 digits");
        }
        else if (num>999999 && num<10000000){
            System.out.println("7 digits");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
