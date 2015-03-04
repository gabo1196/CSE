// Gabriel Gaydos
// hw06

import java.util.Scanner;

public class GetIntegers {
    public static void main(String [ ] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 5 non-negative integers:");
        int sum = 0;
        for (int i=0; i<5; i++) {
            if(myScanner.hasNextInt()) {
                int x = myScanner.nextInt();
                if(x<0){
                    System.out.println("Invalid input, enter again");
                    i--;
                }
                else{
                    sum += x;
                }
            }
            else {
                i--;
                String y = myScanner.next();
                System.out.println("Invalid input, enter again");
            }
        }
        System.out.println("Sum is : " + sum);
    }
}