import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero para la base");
        int base = sc.nextInt();
        System.out.println("Escriba un numero para el exponente");
        int esp = sc.nextInt();
        int total = 1;
        for (int i = 1; i>=esp; i++) {
            total = total*base;
            System.out.println(base +" ^ "+ i );
        }
    }
}
