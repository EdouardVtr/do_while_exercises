import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int val, last;

        System.out.print("Entrez une suite de nombres positifs (terminer par -1) : ");
        val = scan.nextInt();

        if (val == -1) {
            System.out.println("Pas de nombre, pas de dernier !");
        }
        else {
            do {
                last = val;
                System.out.print("Entrez le nombre suivant : ");
                val = scan.nextInt();
            } while (val != -1);
            System.out.println("Le dernier nombre est : " + last);
        }
    }
}
