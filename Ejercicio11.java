import java.util.Scanner;

/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIntro = 0;
        System.out.println("Introduzca un numero");
        numIntro = sc.nextInt();
        for ( int num = 0;  num >=6; num++){    
            int n = numIntro ++;
            System.out.println(numIntro + n^2 + n^3 );
            }
        sc.close();
    }
}
