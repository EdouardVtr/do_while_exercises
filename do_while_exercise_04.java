import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nb;
        int dernier = 0;

        do {
            System.out.println("Entrez votre valeur : ");
            nb = scan.nextInt();
            if (nb != -1) {
                dernier = nb;
            }
        } while (nb != -1);
        System.out.println("Le dernier est : " + dernier);
    }
}
