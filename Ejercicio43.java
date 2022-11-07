import java.util.Scanner;

public class Ejercicio43 {
/*Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena) */    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero y positivo");
        int n = sc.nextInt();
        System.out.print("Introduzca la posicion apartir de la posicion que se quiere partir el numero");
        int pos = sc.nextInt();
        int aux = n;
        int longitud = 0;
        while(aux>0){
            aux/= 10;
            longitud++;
        }
        int izq =(int) (n /Math.pow(10, longitud-pos+1));
        int derecha = (int) (n %Math.pow(10, longitud-pos+1));
        System.out.printf("Los numeros partidos son el %d y %d ", izq,derecha);
        sc.close();
    }
}
