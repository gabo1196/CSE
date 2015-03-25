// Gabriel Gaydos
// hw08

import java.util.Scanner;
import java.util.Random;

public class HW08{
    public static void giant(){
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    public static void cave(){
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    public static void box(){
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               ");
    }
    public static String getInput(Scanner scan, String string){
        String answer = scan.next();
        if(!answer.equals("c") && !answer.equals("C")){
            System.out.println("Yea right LOSER!");
            System.exit(0);
        }
        else{
            return answer;
        }
        return answer;
    }
    public static String getInput(Scanner scan, String string, int trial){
    String answer="";
    boolean test = true;
        while(test){
            answer = scan.next();
            if(answer.equals("a") || answer.equals("A")){
                int i = (int)(Math.random() * 2);
                if(i == 0){
                    System.out.println("Critical Hit!");
                    trial--;
                }
                else{
                    System.out.println("Gosh! How can you miss it!");
                }
                if(trial == 0){
                    System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
                    test=false;
                }
            }
            else if(answer.equals("e") || answer.equals("E")){
                int j = (int)(Math.random() * 10) +1;
                if(j == 10){
                    System.out.println("You have successfully escaped the Giant!");
                    break;
                }
                else{
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else to YIELD");
                }
            }
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            }
        }
        return answer;
    }
    
    public static String getInput(Scanner scan){
        String answer = scan.next();
        switch (answer) {
            case "1" :
                System.out.println("Your prize is $500");
                break;
            case "2" :
                System.out.println("Your prize is $1000");
                break;
            case "3" :
                System.out.println("Your prize is $2000");
                break;
            default:
                System.out.println("A Wrong Number! you get nothing! You better restart the game LOL!");
                break;
        }
        
        return answer;
    }
    public static void main(String [] args){
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("you walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("There are three treasure boxes in front of you! Enter the box number that you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
}