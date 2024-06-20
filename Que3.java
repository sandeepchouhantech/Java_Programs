package Ifelse;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st person name = ");
        String data1 = sc.next();
        System.out.println("Enter 1st person age = ");
        int age1 = sc.nextInt();

        System.out.println("Enter 2nd person name = ");
        String data2 = sc.next();
        System.out.println("Enter 2nd person age = ");
        int age2 = sc.nextInt();

        if (age1<=12){
            System.out.println(data1+ "is Child");
        }
        if(age1>12 && age1<=18){
            System.out.println(data1+ "is Teenager");
        }
        if(age1>18 && age1<=45){
            System.out.println(data1+ " is Youngster");
        }
        if(age1>45){
            System.out.println(data1+ "is Senior citizen");
        }

        if (age2<=12){
            System.out.println(data2+ "is Child");
        }
        if(age2>12 && age2<=18){
            System.out.println(data2+ "is Teenager");
        }
        if(age2>18 && age2<=45){
            System.out.println(data2+ "is Youngster");
        }
        if(age2>45){
            System.out.println(data2+ "is Senior citizen");
        }
        else{
            System.out.println();
        }
    }
}
