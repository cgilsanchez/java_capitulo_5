import java.util.Scanner;

/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
public class Ejercicio16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        boolean primo = false;
        int n = sc.nextInt();
        for (int i = 2; i<n;i++){
            if (n%i==0){
                primo = true;
            }

        }

        if (primo){
            System.out.print("El numero es primo");
        }else{
            System.out.print(" No es primo");
        }
    }
}