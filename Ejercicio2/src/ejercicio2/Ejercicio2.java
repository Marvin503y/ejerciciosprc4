package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        float compra, total;
        int bolita;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el total de compras : ");
        compra = leer.nextFloat();
        System.out.println("seleccione la bolita roja=1, verde=2, blanca=3: ");
        bolita = leer.nextInt();
        
        switch (bolita) {
            case 1:
                total = (float) (compra - (compra * 0.10));
                System.out.println("se le ha aplicado el total del 10%, nuevo total a pagar es de: " + total);
                System.out.println("Feliz Día");
                break;
            case 2:
                total = (float) (compra - (compra * 0.05));
                System.out.println("se le ha aplicado el total del 5%, nuevo total a pagar es de: " + total);
                System.out.println("Feliz Día");
                break;
            default:
                System.out.println("No aplica para un descuento, gracias por participar :)");
                break;
        }

    }

}
