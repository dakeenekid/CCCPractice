package Java_Demos.CCCPractice;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by davis on 2/27/17.
 */
public class yearPractice {

    public static void main(String args[]){
        String numbers = "1234567890";
        Scanner year = new Scanner(in);
        int newYear = year.nextInt();
        String yearr = year.toString();

        for (int i=0; i<yearr.length(); i++){
            if(numbers.indexOf(yearr.charAt(i)) > -1 ){
                newYear++;
            }

        }
        System.out.println(newYear);


        }


    }
