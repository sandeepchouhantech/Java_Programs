package Ifelse;

public class Que6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz" + " " + i);
            }
            if (i % 5 == 0) {
                System.out.println("Buzz" + " " + i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz" + " " + i);
            }
        }
    }
}

