package Ifelse;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maths marks = ");
        int maths_marks = sc.nextInt();
        if (maths_marks>=90){
            System.out.println("A");
        }
        else if (maths_marks<=90 && maths_marks>75) {
            System.out.println("B");
        }
        else if (maths_marks<=75 && maths_marks>60) {
            System.out.println("C");
        }
        else if (maths_marks<=60 && maths_marks>40) {
            System.out.println("D");
        }
        else if(maths_marks<30) {
            System.out.println("Fail");

        }
        else {
            System.out.println("invalid");
        }
    }
}
