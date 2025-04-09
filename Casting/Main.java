package Casting;


public class Main {
    public static void main(String[] args) {

        //casting

        double price=100.00;
        double finalprice=price+18;                //implicit casting
        System.out.println(finalprice);

        int p=100;
        int fp=p+(int)18.0;                         //explicit casting
        System.out.println(fp);
    }
}