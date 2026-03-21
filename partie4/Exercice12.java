package partie4;
import java.util.Scanner;
public class Exercice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        int c = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y')
                c++;
        }

        System.out.println("Voyelles = " + c);

        sc.close();
	}

}
