package Break;


public class Break {
    public static void main(String[] args) {

        //break
        int i=0;
        while(true) {
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }
        }
    }
}
