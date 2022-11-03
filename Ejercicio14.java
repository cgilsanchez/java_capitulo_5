import java.util.Scanner;

public class Ejercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero que se tomará como la base");
        int base = sc.nextInt();
        System.out.println("Escriba otro numero que se tomara como potencia");
        int exp = sc.nextInt();
        int total = 1;
        for (int i = 1; i <= exp; i++){
            total = total*base;
        } System.out.print("El resultado de la potencia es " + total);
sc.close();
    }
}