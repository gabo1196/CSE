public class Testing {
    public static void main(String [] args) {
        int a = 9;
        while (a>0) {
            for (int i=1; i<=a; i++) {
                System.out.print(" ");
                if (a==i) {
                    System.out.println("" + a);
                }
            }
            a--;
        }
    }
}