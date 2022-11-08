import java.util.Scanner;
/* Escribe un programa que pinte por pantalla un par de calcetines, de los que
se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
El usuario debe introducir la altura. Suponemos que el usuario introduce una
altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura*/
public class Ejercicio60{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una altura: ");
        int alt = sc.nextInt();
        if (alt<4){
            System.out.println("Introduzca un numero igual o mayor a 4");
        }
        for (int i = 1;i<=1;i++){
            for (int j = 1;j<=alt-2;j++)
            System.out.println("***    ***");
            for (int y = alt-1;y<=alt;y++)
            System.out.println("****** ******");
            

        }
        sc.close();
    }   

}