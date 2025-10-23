import java.util.Scanner;
public class BarèmeNote {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre note sur 20 : ");
        double note = sc.nextDouble();
        if (note < 0 || note > 20) {
            System.out.println("Erreur : la note doit être comprise entre 0 et 20 !");
        } 
        else if (note >= 16) {
            System.out.println("Votre mention est : A");
        } 
        else if (note >= 14) {
            System.out.println("Votre mention est : B");
        } 
        else if (note >= 12) {
            System.out.println("Votre mention est : C");
        } 
        else if (note >= 10) {
            System.out.println("Votre mention est : D");
        } 
        else {
            System.out.println("Votre mention est : F");
        }

        sc.close();
    }
}
    

    

