// Gabriel Gaydos
// lab04

import java.util.Scanner;

public class Cookies {
    public static void main(String [ ] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter number of people : ");
        int nPpl = 0;
        if(myScanner.hasNextInt()) {
            nPpl = myScanner.nextInt();
        }
        else {
            System.out.println("You did not enter an int");
            return;
        }
        if (nPpl <= 0){
            System.out.println("You did not enter an int > 0");
            return;
        }
        System.out.print("Enter the number of cookies : ");
        int nCookies = 0;
        if (myScanner.hasNextInt()) {
            nCookies = myScanner.nextInt();
        }
        else {
            System.out.println("You did not enter an int");
            return;
        }
        if (nCookies <= 0) {
            System.out.println("You did not enter an int > 0");
            return;
        }
        System.out.print("Enter the number of cookies you want each person to have : ");
        int nPerP = 0;
        if (myScanner.hasNextInt()){
            nPerP = myScanner.nextInt(); // number per person
        }
        if (nCookies < nPerP * nPpl) {
            System.out.println("You will not have enough cookies. You need at least " + ((nPpl * nPerP - nCookies)) + " more cookies");
        }
        else if (nCookies > nPerP * nPpl) {
            System.out.println("You will have enough cookies, but they will not divide evently");
        }
        else {
            System.out.println("You have enough cookies for each person and it will divide evenly");
        }
    }
}