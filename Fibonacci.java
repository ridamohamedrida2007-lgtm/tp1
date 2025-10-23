import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nombre de termes k : ");
        int k = sc.nextInt();
        if (k <= 0) {
            System.out.println("Veuillez entrer un entier positif !");
        } 
        else {
            long a = 0, b = 1;
            System.out.println("Les " + k + " premiers termes de la suite de Fibonacci :");
            for (int i = 1; i <= k; i++) {
                System.out.print(a + " ");
                long suivant = a + b;
                a = b;
                b = suivant;
            }
        }

        sc.close();
    }
}

