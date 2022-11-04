import java.util.Scanner;
/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo). */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero y positivo");
        int n1 = sc.nextInt();
        int n2 = 0;
        if (n1<0){
            System.out.print("El numero tiene que ser positivo");
        }
        for (int i = n1; i < n1+100; i++){
            n2+=i;
            
        }System.out.printf("La suma de los 100 numeros siguientes es de %d", n2);
    } 
}
