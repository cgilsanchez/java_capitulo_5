import java.util.Scanner;
/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
public class Ejercicio19 {
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
            linea += 2;
        }
        
            sc.close();
            
        }
    }






/*System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    
    while (planta <= alturaIntroducida) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
} */