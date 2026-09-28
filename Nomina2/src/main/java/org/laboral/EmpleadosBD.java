package org.laboral;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpleadosBD {

    public static void mostrarTodos(){
        String sql ="SELECT nombre, dni, sexo, categoria, anyos FROM Empleados";

        try (Connection con = ConexionBD.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } ;
    }

}
