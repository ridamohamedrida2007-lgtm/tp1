import java.util.Scanner;
public class Celsius {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Entrez la temperature en Celsius: ");
        double c = sc.nextDouble();
        double f = (c*9/5)+32;
        System.out.println("La temperature en Fahrenheit est : " + f);
        sc.close();
        }
    }
    

