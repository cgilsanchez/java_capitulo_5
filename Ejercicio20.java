
    import java.util.Scanner;
/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
public class Ejercicio20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la altura");
    int alturaIntroducida = sc.nextInt();
    System.out.println("¿Con que caracter quieres pintar la piramide?");
    String caracter = sc.next();
    int altura = 1;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
    
      // inserta espacios delante
    for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
    }

    
    System.out.print(caracter);
    for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
    }
    
    if (altura>1) {
        System.out.print(caracter);
    }
    
    System.out.println();
    altura++;
    espaciosPorDelante--;
    espaciosInternos += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < altura*2; i++) {
    System.out.print(relleno);
    }
    }
}

