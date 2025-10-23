import java.util.Scanner;
public class BMI {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre poids en kg: ");
        double p = sc.nextDouble();
        System.out.print("Entrez votre taille en m: ");
        double t = sc.nextDouble();
        double IMC =p/(t*t);
        System.out.println("Votre IMC est : " + IMC);
        sc.close();

    }
}
