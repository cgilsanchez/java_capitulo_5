import java.util.Scanner;
/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int cont = 0;
        int n = 0;
        int media = 0;
        while (suma<10000){
            System.out.println("Introduzca un numero");
            n = sc.nextInt();
            if (suma<10000){
                suma+=n;
                cont++;
                media = suma/cont;
                
            }else {
                System.out.print("La suma de los numeros tiene que ser menor que 10000");
            }
            


        }System.out.printf("El total es de %d",suma);
        System.out.printf(" Y se han introducido %d numeros", cont);
        System.out.printf(", la media de los numeros introducidos es de %d ", media);
    }
}
