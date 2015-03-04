// Gabriel Gaydos
// hw06

import java.util.Scanner;

public class RunFactorial {
    public static void main(String [ ] args) {
        Scanner myScanner = new Scanner(System.in);
        int val = 0;
        int fact = 0;
        do{
            System.out.println("Please enter an integer that is between 9 and 16");
            if(myScanner.hasNextInt()){
                val = myScanner.nextInt();
                int x = val;
                fact = 1;
                if(val >= 9 && val <= 16){
                    while (x > 1) {
                        fact = fact*x;
                        x--;
                    }
                }
                else{
                    System.out.println("Invalid input, enter again!");
                }
            }
            else{
                System.out.println("Invalid input, enter again!");
                myScanner.next();
            }
                
        }while(val < 9 || val > 16);
        
        System.out.println("" + val + "!= " + fact);
    }
}