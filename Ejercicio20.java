
    import java.util.Scanner;
/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
public class Ejercicio20 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura");
        int alt = sc.nextInt();
        System.out.println("¿Con que caracter quieres pintar la piramide?");
        String caracter = sc.next();
        int espacios = alt-1;
        int planta = 1;
        int linea = 1;
        while(planta<=alt){
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
        
            
            for (int i = 1; i <= linea; i++) {
                System.out.print(caracter);
            }
        
            System.out.println();
        
            planta++;
            espacios--;
            linea+=2;
        }
        
            sc.close();
            
        }
    }


