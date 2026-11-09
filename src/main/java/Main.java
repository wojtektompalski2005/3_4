import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą (nieujemną): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Silnia jest zdefiniowana tylko dla liczb nieujemnych!");
        } else {
            long silnia = 1;

            
            for (int i = 1; i <= n; i++) {
                silnia *= i; 
            }

            System.out.println(n + "! = " + silnia);
        }

        scanner.close();
    }
}