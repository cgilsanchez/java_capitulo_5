import java.util.Scanner;

/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado. */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        int a =0;
        int b = 1;
        int c =0;
        for (int i =1; i<=n; i++){
            System.out.print(c+" ");
            a=b;
            b =c;
            c = a+b;

        }
    }
}
