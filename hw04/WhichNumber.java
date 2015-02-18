// Gabriel Gaydos
// hw04

import java.util.Scanner;
 
public class WhichNumber {
        
    public static void main(String [ ] args) {
        
        Scanner myScanner = new Scanner (System.in);
            System.out.println("Think of a number between 1 and 10 inclusive");
            System.out.println("Is the number even?");
        
        String str = myScanner.next();
        str = str.toLowerCase();
        char input = str.charAt(0);
        if (input == 'y') {
            System.out.println("is it divisible by 3?");
            str = myScanner.next();
            str = str.toLowerCase();
            input = str.charAt(0);
            if (input == 'y') {
                System.out.println("your number is 6");
                return;
            }
        if (input == 'n') {
            System.out.println("is your number divisible by 4?");
            str = myScanner.next();
            str = str.toLowerCase();
            input = str.charAt(0);
            if (input == 'y') {
                System.out.println("is your number divided by 4 greater than 1?");
                str = myScanner.next();
                str = str.toLowerCase();
                input = str.charAt(0);
                if (input == 'y') {
                    System.out.println("your number is 8");
                    return;
                }
                if (input == 'n') {
                    System.out.println("your number is 4");
                    return;
                }
            }
            if (input == 'n') {
                System.out.println("is it divisible by 5?");
                str = myScanner.next();
                str = str.toLowerCase();
                input = str.charAt(0);
                if (input == 'y') {
                    System.out.println("your number is 10");
                    return;
                }
                if (input == 'n') {
                    System.out.println("your number is 2");
                    return;
                }
            }
        }
    }
    if (input == 'n') {
            System.out.println("is it divisible by 3?");
            str = myScanner.next();
            str = str.toLowerCase();
            input = str.charAt(0);
            if (input == 'y') {
                System.out.println("When divided by 3 is the result greater than 1?");
                str = myScanner.next();
                str = str.toLowerCase();
                input = str.charAt(0);
                if (input == 'y') {
                    System.out.println("your numebr is 9");
                }
                if (input == 'n') {
                    System.out.println("your number is 3");
                }
            }
            if (input == 'n') {
                System.out.println("is it greater than 6?");
                str = myScanner.next();
                str = str.toLowerCase();
                input = str.charAt(0);
                if (input == 'y') {
                    System.out.println("your number is 7");
                }
                if (input == 'n') {
                    System.out.println("is it less than 3?");
                    str = myScanner.next();
                    str = str.toLowerCase();
                    input = str.charAt(0);
                    if (input == 'y') {
                        System.out.println("your number is 1");
                    }
                    if (input == 'n') {
                        System.out.println("your number is 5");
                    }
                }
            } 
        }
    }
}