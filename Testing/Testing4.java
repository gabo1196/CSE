public class Testing4 {
    public static void main(String [] args) {
        int a = 0;
        while (a <= 4) {
            for (int i=0; i<=a; i++) {
                System.out.print(a);
            }
            System.out.println("");
            a++;
        }
        for (int x=5; x<=9; x++) {
            for (int y=(10-x); y>0; y--) {
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}