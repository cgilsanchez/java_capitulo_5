import java.util.Scanner;
/*Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7. */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num1 = sc.nextInt();
        System.out.println("Introduzca un segundo numero");
        int num2 = sc.nextInt();
        if (num1 == num2){
        System.out.print("Introduzca de nuevo dos numeros que no sean iguales");
        }for(int i = num1 ;i<=num2;i+=7){
            System.out.println("Los numueros enteros saltando de 7 en 7 comprendidos entre" + num1 + " y " + num2);
            System.out.println(i);
        }
        sc.close();
    }
}
