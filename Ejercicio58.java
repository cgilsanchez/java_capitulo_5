import java.util.Scanner;
/*Realiza un programa que calcule la media de los dígitos que contiene un número
entero introducido por teclado. */
public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        long n = sc.nextLong();
        int cont = 0;
        int suma = 0;
            while (n > 0) {
                suma += n % 10;
                n /= 10;
                cont++;
            
        }
        System.out.println("La media de los digitos es de  " +  (double)suma/cont);
        sc.close();
    }
}
