import java.util.Scanner;

public class Testing3 {
    public static int sum (int a, int b) {
        int x = 0;
        for (int i=a; i<=b; i++) {
            x+=i;
        }
        return x;
    }
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.print("Enter an int: ");
            int a = myScanner.nextInt();
            System.out.print("Enter an int greater than " + a + ": ");
            int b = myScanner.nextInt();
            if (b <= a) {
                System.out.println("Sorry, you enter an int <= to " + a );
            }
            else {
                sum(a,b);
                int y = sum(a,b);
                System.out.println(y);
                check = false;
            }
        }
    }       
}