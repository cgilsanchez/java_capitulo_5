import java.util.Scanner;
/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos. */

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int contt = 0;
        for(int i =1;i<=10;i++){
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();
        if (n>0){
            cont++;
        } if (n<0){
            contt++;
        }

        }
        System.out.printf("Hay %d numeros positivo", cont);
        System.out.printf(" Y %d numeros negativo", contt);
    }
    
}
