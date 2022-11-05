import java.util.Scanner;
/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        int suma = 0;
        int par = 0;
        int contImpar = 0;

        do {
            System.out.println("Introduzca un numero");
            num = sc.nextInt();
            if (num>=0){
            cont++;
            if ((num % 2)== 1){
            suma+=num;
            contImpar++; 
            }else {
                if (num>par)
                    par = num;
            }
            }
            
        }while(num>=0);
        System.out.println("Se han introducido " + cont + " numeros");
        System.out.println("La media de los numeros impares es " + suma );
        System.out.print("El mayor de los pares es " + par);
    }
}
