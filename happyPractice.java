package Java_Demos.CCCPractice;

import java.util.Scanner;

/**
 * Created by davis on 2/25/17.
 */
public class happyPractice {

    public static void main(String args[]) {
        Scanner line = new Scanner(System.in);
        String happysad = line.nextLine().toString();
        int sad = 0;
        int happy = 0;

        for (int i = 0; i < happysad.length(); i++) {
            if (happysad.charAt(i) == '(') {
                sad++;
            } else if (happysad.charAt(i) == ')') {
                happy++;
            }
        }

        if (sad < happy){
            System.out.println("Happy");
        }
        if (sad > happy){
            System.out.println("Sad");
        }
        if (sad == happy && sad > 0 && happy > 0){
            System.out.println("Unsure");
        }
        if (sad == 0 && happy == 0){
            System.out.println("None");
        }
    }

}
