package org.laboral;

import org.laboral.exceptions.DatosNoCorrectos;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class FicheroEmpleados {

    public ArrayList<Empleado> leer() throws DatosNoCorrectos {
        ArrayList<Empleado> empleados = new ArrayList<>();

        InputStream entrada =
                FicheroEmpleados.class.getResourceAsStream("/data/empleados.txt");

        Scanner fichero = new Scanner(entrada);

        while (fichero.hasNextLine()) {
            String linea = fichero.nextLine();

            String[] datos = linea.split(";");

            String nombre = datos[0];
            String dni = datos[1];
            char sexo = datos[2].charAt(0);
            int categoria = Integer.parseInt(datos[3]);
            int anyos = Integer.parseInt(datos[4]);

            Empleado empleado = new Empleado(nombre,dni, sexo, categoria, anyos);
            empleados.add(empleado);

        }

        return empleados;

    }

}
