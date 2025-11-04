import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Combien de valeur voulez-vous rentrer ? : ");
        int nbVal = scan.nextInt();

        do {
            System.out.println("Ce nombre est invalide, recommencez : ");
            nbVal = scan.nextInt();
        } while (nbVal <= 0);

        double somme = 0;
        int count = 0;

        do {
            System.out.println("Entrez une valeur : ");
            int val = scan.nextInt();
            somme += val;
            ++count;


        } while (count < nbVal);

        double moyenne = somme / nbVal;
        System.out.println("La moyenne de ces " + nbVal + " nombres est : " + moyenne);
    }
}
