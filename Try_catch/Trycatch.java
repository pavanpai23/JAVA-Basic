package Try_catch;


public class Trycatch {
    public static void main(String[] args) {


        //try and catch in exception handaling

        int[] marks={97,98,95};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            //do something after catching
        }
        System.out.println("the name is aman");
    }
}
