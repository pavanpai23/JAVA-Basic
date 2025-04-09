package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int physics=98;
        int chem = 93;
        int eng = 99;

        int[] marks= new int [3];
        marks[0]=98;
        marks[1]=93;
        marks[2]=99;

        System.out.println(marks[2]);


        //length
        System.out.println(marks.length);

        //sort  meaning putting in assending order
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}