import java.util.Scanner;
public class Triangle {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Entrez le côté a : ");
        double a = sc.nextDouble();
        System.out.print("Entrez le côté b : ");
        double b = sc.nextDouble();
        System.out.print("Entrez le côté c : ");
        double c = sc.nextDouble();
    if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Erreur : les côtés doivent être positifs !");
        } 
        else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Triangle invalide !");
        } 
        else {
             if (a == b && b == c) {
                System.out.println("Le triangle est équilatéral.");
            } 
            else if (a == b || a == c || b == c) {
                System.out.println("Le triangle est isocèle.");
            } 
            else {
                System.out.println("Le triangle est scalène.");
            }
        }

        sc.close();
}
}