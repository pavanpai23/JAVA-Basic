package loops;


public class Array {
    public static void main(String[] args) {

        //loops

        //for loop
        //1-100
        for(int i=1;i <= 100 ;i++){
            System.out.println(i);
        }

        //100-1
        for (int i = 100; i >= 1; i--)
            System.out.println(i);

        //while loop

        int j=100;
        while(j>=1){
            System.out.println(j);
            j--;

            //do while
            int k=100;
            do{
                System.out.println(k);
                k--;
            }while(k>=1);
        }
    }
}