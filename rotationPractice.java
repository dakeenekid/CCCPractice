package Java_Demos.CCCPractice;

import java.util.Scanner;

/**
 * Created by davis on 2/27/17.
 */
public class rotationPractice {

    public static void main(String args[]) {
        String letters = "IOSHZXN";
        int max = 30;
        Scanner input = new Scanner(System.in);
        String sequence = input.nextLine().toString();
        String s = sequence.substring(0, Math.min(sequence.length(), max));

        int a = 0;
        for (int i = 0; i < sequence.length(); i++){
            if (letters.indexOf(s.charAt(i)) >= 0) {
                a++;
            }
        }

        if (a == sequence.length()) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
    }


