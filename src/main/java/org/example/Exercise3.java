package org.example;
import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {

        int choice,x, y;

        Scanner scan = new Scanner(System.in);

        System.out.println("Multiply 1");
        System.out.println("Divide 2");
        System.out.println("Addition 3");
        System.out.println("Subtraction 4");
        choice = scan.nextInt();

        System.out.println("Enter the first number ");
        x = scan.nextInt();
        System.out.println("Enter the second number ");
        y = scan.nextInt();

        switch (choice) {

            case 1:
                pro(x,y);break;
            case 2:
                div(x,y);break;
            case 3:
                add(x,y);break;
            case 4:
                sub(x,y);break;
        }

    }

    private static void pro(int x,int y) {
        int answer = x*y;

        System.out.println("Multiplied " +answer);

    }

    private static void div(int x,int y) {
        int answer = x/y;

        System.out.println("Divided " +answer);

    }
    private static void add(int x,int y) {
        int answer = x+y;

        System.out.println("Addition " +answer);

    }
    private static void sub(int x,int y) {
        int answer = x-y;

        System.out.println("Subtraction " +answer);

    }

}
