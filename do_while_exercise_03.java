import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int somme = 0, count = 1, val;

        System.out.print("Entrez une suite de nombre positifs (terminer par -1) : ");
        val = scan.nextInt();

        if (val == -1) {
            System.out.println("Pas de nombre, pas de moyenne !");
        }
        else {
            do {
                ++count;
                somme += val;
                System.out.print("Entrer la valeur numéro " + count + " : ");
                val = scan.nextInt();
            } while (val != -1);
            System.out.println("Moyenne : " + (double) somme / (count - 1));
        }
    }
}
