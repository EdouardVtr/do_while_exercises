import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double val= 0;
        double somme = 1;
        int count = -1;

        do {
            System.out.println("Entrez votre valeur :");
            val = scan.nextInt();
            somme += val;
            ++count;
        } while (val != -1);
        double moyenne = somme / count;
        System.out.println("La somme de ces " + count + " nombres est : " + moyenne);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nb = 0, count = 0, somme = 0;

        do {
            somme += nb;
            ++count;
            System.out.print("Entrez le " + count + " nombre : ");
            nb = scan.nextInt();
            if (nb == -1) {
                --count;
            }
        } while (nb != -1);
        double moyenne = somme / count;
        System.out.println("La moyenne des " + count + " est " + moyenne);
    }
}
