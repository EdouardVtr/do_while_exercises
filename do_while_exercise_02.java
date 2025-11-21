import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double somme = 0;
        int nbVal;

        do {
            System.out.print("Combien de valeur voulez-vous rentrer ? " + "(vous devez entrer une valeur positive) : ");
            nbVal = scan.nextInt();
        } while (nbVal <= 0);

        int count = 0;

        do {
            System.out.print("Entrez une valeur : ");
            int val = scan.nextInt();
            somme += val;
            ++count;
        } while (count < nbVal);
        System.out.println("La moyenne de ces " + nbVal + " nombres est : " + (double) somme / nbVal);
    }
}
