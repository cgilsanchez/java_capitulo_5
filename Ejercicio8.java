import java.util.Scanner;

/*Muestra la tabla de multiplicar de un número introducido por teclado.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero");
        int numLeido = sc.nextInt();
        for (int i = 0; i<=10; i++){
        System.out.print(numLeido , i , numLeido * i);
        }sc.close();
    }

}
