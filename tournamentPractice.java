package Java_Demos.CCCPractice;

import java.util.Scanner;

/**
 * Created by davis on 2/25/17.
 */
public class tournamentPractice {

    /*Each player in a tournament plays six games. There are no ties. The tournament director places
the players in groups based on the results of games as follows:
• if a player wins 5 or 6 games, they are placed in Group 1;
• if a player wins 3 or 4 games, they are placed in Group 2;
• if a player wins 1 or 2 games, they are placed in Group 3;
• if a player does not win any games, they are eliminated from the tournament.
Write a program to determine which group a player is placed in.
Input Specification
The input consists of six lines, each with one of two possible letters: W (to indicate a win) or L (to
indicate a loss). */





    public static void main(String args[]){
        System.out.println("Please enter the W/L form of the player: ");

        int gamesWon = 0;

        for (int i = 0; i<6; i++) {
            Scanner scan = new Scanner(System.in);
            String gameForm = scan.nextLine().toString();
            if (gameForm.indexOf('W') != -1) {
                gamesWon = gamesWon + 1;
            }
        }

        if (gamesWon == 5 || gamesWon == 6){
            System.out.println(3);
        }
        else if (gamesWon == 4 || gamesWon == 3){
            System.out.println(2);
        }
        else if (gamesWon == 2 || gamesWon == 1){
            System.out.println(1);
        }
        else if (gamesWon == 0) {
            System.out.println(-1);


        }
    }


}

