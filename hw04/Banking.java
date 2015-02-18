// Gabriel Gaydos
// hw04

import java.util.Scanner;
import java.util.Random;

public class Banking {
        
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        double nBankTrans = Math.random() * (5000 - 1000) + 1000;
        nBankTrans *= 100;
        int nBankTransAsInt = (int) nBankTrans;
        nBankTrans = nBankTransAsInt * .01;
        System.out.println("Your current balance is : " + nBankTrans + " ");
        System.out.println("Would you like to deposit money (D), withdraw money (W), or view your balance (V)?");
        String str = myScanner.next();
        str = str.toUpperCase();
        char input = str.charAt(0);

        if (input == 'D' || input == 'W' || input == 'V') {

            switch (input) {

            case ('D'):
                System.out.println("How much do you want to deposit?");
                int nDeposit = myScanner.nextInt();
                double nDepositTotal = nBankTrans + nDeposit;
                System.out.println("Your new balance is : " + nDepositTotal + " ");
                if (nDeposit < 0) {
                    System.out.println("Invalid input");
                }
                return;
                
            case ('W'):
                System.out.println("How much do you want to withdraw?");
                int nWithdraw = myScanner.nextInt();
                double nWithdrawTotal = nBankTrans - nWithdraw;
                System.out.println("Your new balance is : " + nWithdrawTotal + " ");
                if (nWithdraw < 0) {
                    System.out.println("Invalid input");
                }
                return;
                
            case ('V'):
                System.out.println("Here is your current balance : " + nBankTrans + " ");
            }
        }
    }
}