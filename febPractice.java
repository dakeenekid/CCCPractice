package Java_Demos.CCCPractice;

import java.util.Scanner;

/**
 * Created by davis on 2/25/17.
 */
public class febPractice {



    public static void main(String args[]){

        Scanner day = new Scanner(System.in);
        Scanner month = new Scanner(System.in);

        System.out.println("Please enter the month (1-12) : ");
        int month1 = Integer.parseInt(month.nextLine());
        System.out.println("Please enter the day (1-31) : ");
        int day1 = Integer.parseInt(day.nextLine());

        if (month1 == 2 && day1 == 18){
            System.out.println("Special");
        }
        else if (month1 <= 2 && day1 < 18){
            System.out.println("Before");
        }
        else if (month1 >= 2 && day1 > 18){
            System.out.println("After");
        }
        else if (month1 > 2){
            System.out.println("After");
        }
    }
}
