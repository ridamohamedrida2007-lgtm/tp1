import java.util.Scanner;
public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le premier entier: ");
        int a = sc.nextInt();
        System.out.print("Entrez le deuxieme entier: ");
        int b = sc.nextInt();
        System.out.print("Entrez le troisieme entier: ");
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Le maximum des trois entiers est : " + max);
        sc.close();
        
    }
}
