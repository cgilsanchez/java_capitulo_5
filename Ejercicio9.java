import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.print("Introduzca un numero");
        Scanner sc = new Scanner(System.in);
        int numLeido = sc.nextInt();
        int num = numLeido;
        int cont = 0;
        do{
            cont++;
            num/=10;
        }while(num!=0);
        System.out.printf("El numero %d tiene %d digitos", numLeido, cont);
        sc.close();
    }
}
