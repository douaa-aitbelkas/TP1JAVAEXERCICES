package partie2;
import java.util.Scanner;
public class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }

        sc.close();
    }
}