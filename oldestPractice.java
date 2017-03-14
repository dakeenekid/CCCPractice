package Java_Demos.CCCPractice;

import java.util.Scanner;

/**
 * Created by davis on 2/27/17.
 */
public class oldestPractice {

    public static void main(String args[]){
        int youngest;
        int middle;
        Scanner young = new Scanner(System.in);
        youngest = young.nextInt();
        Scanner middlec = new Scanner(System.in);
        middle = middlec.nextInt();
        int incriment = middle - youngest;
        int oldest = incriment + middle;

        System.out.println(oldest);


    }


}
