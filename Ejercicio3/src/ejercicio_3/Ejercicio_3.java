package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int numeroEmpleados;
        double[] sueldos;
        double sueldoIngresado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Rigistre la cantidad de empleados a ingresar sueldos: ");
        numeroEmpleados = leer.nextInt();
        sueldos = new double[numeroEmpleados];
        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("Ingresar sueldo de empleado " + (i + 1) + ": ");
            sueldoIngresado = leer.nextDouble();
            

            if (sueldoIngresado < 0) {
                do {
                    System.out.println("No se admiten cantidades negativas ingrese de nuevo el sueldo: ");
                    sueldoIngresado = leer.nextDouble();
                } while (sueldoIngresado < 0);
            }

            sueldos[i] = sueldoIngresado;
        }

        int contador = 1;

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Sueldo Empleado " + contador + ": " + sueldos[i]);
        }
    }

}
