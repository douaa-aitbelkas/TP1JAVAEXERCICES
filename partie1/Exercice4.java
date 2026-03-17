package partie1;
import java.util.Scanner;
public class Exercice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        int somme = 0;

        while (i <= n) {
            somme = somme + i;
            i++;
        }

        System.out.println("Somme = " + somme);

        sc.close();
    }
}
