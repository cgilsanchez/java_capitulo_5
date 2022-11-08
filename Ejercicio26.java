import java.util.Scanner;

public class Ejercicio26 {
    /*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        long n = sc.nextLong();
        System.out.println("Introduzca un digito");
        int digito = sc.nextInt();
        long aux = n;
        long auxDigito = 0;
        int i = 0;
        long numeroReves = 0;

        while (aux>0) {
            numeroReves = (numeroReves*10) + (aux%10);
            aux/= 10;
        }

        while(numeroReves > 0){
            auxDigito= numeroReves%10;
            i++;
            if(auxDigito == digito){
                System.out.print("El número " + n + ", el digito " + auxDigito + " corresponde con " + i);
            }
            numeroReves/=10;
        }
        



        


    }
}
