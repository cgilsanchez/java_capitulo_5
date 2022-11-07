import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero y positivo");
        int n = sc.nextInt();
        int aux = n;
        int longitud = 0;
        while(aux>0){
            aux/= 10;
            longitud++;
        }
        int primero =(int) (n / Math.pow(10, longitud-1));
        int resto = (int) (n % Math.pow(10, longitud-1));
        System.out.printf("El numero resultado es %d ", resto*10+primero);
        sc.close();
    }
}


