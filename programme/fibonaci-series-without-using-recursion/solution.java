import java.util.Scanner;

public class solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int n = sc.nextInt();
        int a = 0, b = 1, temp = 0;

        System.out.print("\n" + a + " " + b);

        for (int i = 2; i < n; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        sc.close();
    }
}