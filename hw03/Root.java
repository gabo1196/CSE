// Gabriel Gaydos
// hw03

import java.util.Scanner;

public class Root {
    public static void main(String [ ] args){
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        System.out.print("Enter a value for x : ");
        double X = myScanner.nextInt();
        double guess,
        secondGuess,
        thirdGuess,
        fourthGuess,
        fifthGuess,
        sixthGuess;
        guess = (X / 3);
        secondGuess = (2*guess*guess*guess+X)/(3*guess*guess);
        thirdGuess = (2*secondGuess*secondGuess*secondGuess+X)/(3*secondGuess*secondGuess);
        fourthGuess = (2*thirdGuess*thirdGuess*thirdGuess+X)/(3*thirdGuess*thirdGuess);
        fifthGuess = (2*fourthGuess*fourthGuess*fourthGuess+X)/(3*fourthGuess*fourthGuess);
        sixthGuess = (2*fifthGuess*fifthGuess*fifthGuess+X)/(3*fifthGuess*fifthGuess);
        System.out.println("The crude estimate of the cube root of x is " + guess);
        System.out.println("The cube root of x is " + sixthGuess);
        System.out.println("The value of the crude estimate cubed is " + sixthGuess*sixthGuess*sixthGuess);
        
    }
}