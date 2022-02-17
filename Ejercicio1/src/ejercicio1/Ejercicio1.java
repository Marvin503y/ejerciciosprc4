package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        float nota = (float) 0.00;

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresando la nota: ");

        nota = leer.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprobado felicidades");
        } else if (nota >= 6.50 && nota <= 6.99) {
            System.out.println("Aplica el examen de suficiencia para aprobar ya que su nota es: " + nota);
        } else {
            System.out.println("reprobado");
        }
    }

}
