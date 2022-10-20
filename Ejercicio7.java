import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 4320;
        int intentos = 4;
        boolean salir = false;

        do {
            System.out.print("Introduzca la contraseña");
            int contraseña = sc.nextInt();
            if (password==contraseña){
            salir=true;

            }intentos--;
            if (password!=contraseña){
                System.out.print("Introduce de nuevo la contraseña, te quedan 3 intentos");
            
            if (password!=contraseña){
                System.out.print("Introduzca de nuevo la contraseña, te quedan 2 intentos");
            }
            if (password!=contraseña){
                System.out.print("Introduzca de nuevo la contraseña, te quedan 1 intentos");
            }
            if (password!=contraseña){
                System.out.print("Ya no te quedan mas intentos");

            } else{
                salir=true;
                System.out.print("No ha sido posible abrir la caja fuerte");
            } 
            
            
        } while {
            contraseña!=password; 
            intentos => 0;
            
        }
        
        }

    }
}
