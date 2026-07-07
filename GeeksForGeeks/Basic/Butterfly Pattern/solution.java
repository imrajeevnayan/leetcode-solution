import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }

            // Right stars
            if (i != n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        // Lower half (start from n-1 to avoid repeating the middle row)
        for (int i = n - 1; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}