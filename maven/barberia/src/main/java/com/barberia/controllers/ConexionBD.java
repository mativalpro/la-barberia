package com.barberia.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // el jdbc cambia dependiendo de la base de datos que usemos, 
    // por ejemplo para mysql sería:
    // private static final String URL = 
    // "jdbc:mysql://localhost:3306/registro_person
    private static final String URL =
        "jdbc:mysql://localhost:3306/Barberia";

    private static final String USUARIO = "root"; //usuario de la base de datos

    private static final String CLAVE = "M4T1valpr0"; //clave de la base de datos

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(
            URL, USUARIO, CLAVE
        );
    }
}
