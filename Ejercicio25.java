import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero");
        long n = sc.nextLong();
        long aux = n;
        long volteado = 0;
        while (n>0){
            volteado=volteado*10+n%10;
            n=n/10;
        }
        System.out.printf("El numero Introducido %d y al reves es %d ", aux , volteado);
        sc.close();
    }
}
