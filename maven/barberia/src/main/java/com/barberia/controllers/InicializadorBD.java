package com.barberia.controllers;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class InicializadorBD {

    public static void inicializar() throws SQLException {

        String consulta =
            "SELECT 1 FROM information_schema.tables " +
            "WHERE table_schema = 'barberia' " +
            "AND table_name = 'Barbero'";

        String crearTabla =
            "CREATE TABLE Barbero (" +
            "id PRIMARY KEY AUTO_INCREMENT, " +
            "nombre VARCHAR(50) NOT NULL, " +
            "apellido VARCHAR(50) NOT NULL " + 
            ")";

        try (Connection conexion = ConexionBD.conectar();
             Statement sentencia = conexion.createStatement()) {

            boolean existe;

            try (ResultSet resultado =
                     sentencia.executeQuery(consulta)) {
                existe = resultado.next();
            }

            if (!existe) {
                sentencia.executeUpdate(crearTabla);
                System.out.println("Tabla persona creada correctamente.");
            } else {
                System.out.println("La tabla barbero ya existe.");
            }
        }
        String consulta1 =
            "SELECT 1 FROM information_schema.tables " +
            "WHERE table_schema = 'barberia' " +
            "AND table_name = 'Cliente'";

        String crearTabla1 =
            "CREATE TABLE Cliente (" +
            "id PRIMARY KEY AUTO_INCREMENT, " +
            "nombre VARCHAR(50) NOT NULL, " +
            "apellido VARCHAR(50) NOT NULL " + 
            ")";

        try (Connection conexion = ConexionBD.conectar();
             Statement sentencia = conexion.createStatement()) {

            boolean existe;

            try (ResultSet resultado =
                     sentencia.executeQuery(consulta1)) {
                existe = resultado.next();
            }

            if (!existe) {
                sentencia.executeUpdate(crearTabla1);
                System.out.println("Tabla persona creada correctamente.");
            } else {
                System.out.println("La tabla barbero ya existe.");
            }
        }
    }
}
