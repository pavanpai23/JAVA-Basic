package Dowhile_loop;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //do while loop

        Scanner sc=new Scanner(System.in);
        int number=0;

        do{
            System.out.println("input a number");
            number=sc.nextInt();
            System.out.print("here is your number");
            System.out.println(number);

        }while(number>=0);

        System.out.println("the END");
    }
}
