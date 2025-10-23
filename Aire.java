import java.util.Scanner;
public class Aire {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez le rayon du cercele: ");
        double r = sc.nextDouble();
        double aire = Math.PI * r * r;
        System.out.println("L'aire du cercle est : " + aire);
        sc.close();
    }
}
