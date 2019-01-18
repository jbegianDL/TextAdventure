package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String prompt = "Prompt";

        String opt1 = "Option 1";
        String opt2 = "Option 2";
        String opt3 = "Option 3";
        String opt4 = "Option 4";

        String resp1 = "Responce 1";
        String resp2 = "Responce 2";
        String resp3 = "Responce 3";
        String resp4 = "Responce 4";

        String gameOver = "Continue? - Yes or No"; //continue prompt

        boolean playAgain = false; //stopping variable for loop

        do{
            //prompt user
            System.out.println(prompt);

            //options for user
            System.out.println(opt1);
            System.out.println(opt2);
            System.out.println(opt3);
            System.out.println(opt4);

            //creates scanner opject
            Scanner input = new Scanner(System.in);
            //users answer to prompt
            int usrAnswer = input.nextInt();

            //provides response for what condition is met
            if (usrAnswer == 1){
                System.out.println(resp1);
            }else if (usrAnswer == 2){
                System.out.println(resp2);
            }else if (usrAnswer == 3){
                System.out.println(resp3);
            }else if (usrAnswer == 4){
                System.out.println(resp4);
            }else{
                System.out.println("Error! - Incorrect input");
            }

            System.out.println(gameOver);

            //users answer to prompt
            String usrContinue = input.next();

            //sets loop stopping variable to true or false depending on answer
            if (usrContinue.equals("Yes")){
                playAgain = true;
            } else if (usrContinue.equals("No")){
                System.out.println("Goodbye.");
                playAgain = false;
            }else {
                System.out.println("Error! - Incorrect input - Ending Program");
                playAgain = false;
            }

        }while(playAgain);
    }
}