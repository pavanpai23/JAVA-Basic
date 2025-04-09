package Logical_operators;


public class Array {
    public static void main(String[] args) {

        //logical operator
        //&&
        int a=40;
        int b=30;

        if(a<50 && b<50)    //if a=60 then one condition fails then out put not occurs
            System.out.println("both less than 50");

        //  ||   (or)
        int aa=60;
        int bb=40;
        if(aa<50 || bb<50)
            System.out.println("at least one less than 50");

    }
}
