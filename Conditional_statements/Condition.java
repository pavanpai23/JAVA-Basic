package Conditional_statements;

import java.util.Scanner;
public class Condition{
    public static void main(String[] args) {

        //conditional operator

        Scanner sc=new Scanner(System.in);
        //pen=10  ;   notebook=40;

        int cash=sc.nextInt();
        if(cash<10) {
            System.out.println("cannot buy anthing");
            System.out.println("get more cash");
        }

        else if(cash>10 && cash>50)
            System.out.println("buy anything one");
        else
            System.out.println("buy both");

    }
}
