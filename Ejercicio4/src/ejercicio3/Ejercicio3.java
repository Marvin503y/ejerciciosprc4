package ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int cantidadNumeros, numeroMayor = 0, numeroMenor = 0, cantidadPares = 0, numero;

        Scanner leer = new Scanner(System.in);

        System.out.println("numeros a ingresar? ingrese la cantidad: ");
        cantidadNumeros = leer.nextInt();

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Ingresando el numero: ");
            numero = leer.nextInt();


            if (numero < 0) {
                System.out.println("No se permiten cantidades negativas!");
                return;
            }


            if (numero > numeroMayor || numeroMayor == 0) {
                numeroMayor = numero;
            }

            if (numero < numeroMenor || numeroMenor == 0) {
                numeroMenor = numero;
            }
            
           
            if (numero % 2 == 0) {
     
                cantidadPares++;
            }
        }
        
        System.out.println("numero mayor: " + numeroMayor);
        System.out.println("numero menor: " + numeroMenor);
        System.out.println("numero cantidad pares: " + cantidadPares);

    }

}
