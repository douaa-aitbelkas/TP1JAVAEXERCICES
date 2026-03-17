package partie2;
import java.util.Scanner;
public class Exercice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            tab[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (tab[i] == x) {
                System.out.println("Position : " + i);
            }
        }

        sc.close();
    }

	}


