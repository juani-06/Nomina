package org.laboral;

import org.laboral.exceptions.DatosNoCorrectos;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculaNominas  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        try {
           /* Empleado e = new Empleado("James Cosling","32000032G",'M',4,7);

            Empleado e2 = new Empleado("Ada Lovelance","32000031R",'F');

            escribe (e,e2);

            e2.incrAnyo();
            e.setCategoria(9);

            escribe (e,e2);*/

            FicheroEmpleados fichero = new FicheroEmpleados();
            ArrayList<Empleado> empleados = fichero.leer();

            for (Empleado empleado : empleados) {
                System.out.print(empleado);
                System.out.println(" ,sueldo=" + Nomina.sueldo(empleado)+"}");
            }



        do {
            System.out.println();
            System.out.println("===== MENU NOMINA =====");
            System.out.println("0. Salir");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Mostrar el salario de un empleado por DNI");
            System.out.println("3. Modificar datos de un empleado");
            System.out.println("4. Recalcular sueldo de un empleado");
            System.out.println("5. Recalcular sueldos de todos los empleados");
            System.out.println("6. Copia de seguridad de la base de datos en ficheros");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 0: break;
                case 1:
                    for (Empleado empleado: empleados){
                        System.out.println(empleado);
                    }
                    break;

                case 2:
                    String dniBusca;
                    System.out.print("Ingrese el DNI que desea buscar: ");
                    dniBusca = sc.nextLine();
                    for (Empleado empleado: empleados){
                        if (empleado.dni.equals(dniBusca)){
                            System.out.println(empleado);
                            break;
                        }
                    }
                    System.out.println("DNI no encontrado :/");
                    break;

                case 3:
                    submenu(sc);
                    break;
                case 4:
                    String dniBusca2;
                    System.out.print("Ingrese el DNI que desea recalcular: ");
                    dniBusca2 = sc.nextLine();
                    for (Empleado empleado: empleados){
                        if (empleado.dni.equals(dniBusca2)){
                            System.out.println("Sueldo recalculado de "+empleado.nombre+": "+Nomina.sueldo(empleado));
                            break;
                        }
                    }
                    System.out.println("DNI no encontrado :/");
                    break;
                case 5:
                    System.out.println("Recalcular y actualizar los sueldos de todos los empleados.");
                    break;

                case 6:
                    System.out.println("Realizar una copia de seguridad de la base de datos en ficheros.");
                    break;
            }
        }while (opcion != 0);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }


    private static void escribe (Empleado e, Empleado e2){
        System.out.println(e.toString()+ " ,sueldo="+Nomina.sueldo(e)+"}");
        System.out.println(e2.toString()+ " ,sueldo="+Nomina.sueldo(e2)+"}");
    }

    private static void submenu(Scanner sc){
        int opcion = 0;

        do {
            System.out.println();
            System.out.println("--- Modificar empleado ---");
            System.out.println("1. Nombre");
            System.out.println("2. DNI");
            System.out.println("3. Sexo");
            System.out.println("4. Categoría");
            System.out.println("5. Años trabajados");
            System.out.println("0. Volver");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

                    switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }
}

