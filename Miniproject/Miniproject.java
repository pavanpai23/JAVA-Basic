package Miniproject;

import java.util.Scanner;
public class Miniproject {
    public static void main(String[] args) {

        //Mini project
        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
        int userNumber=0;

        do {
            System.out.println("Guess my number(1-100)");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHHOOOO.. CORRECT NUMBER");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("your number is too large");
            } else {
                System.out.println("your number is too small");
            }

        }while(userNumber>=0);
        System.out.println("My Number was:");
        System.out.println(myNumber);
    }
}