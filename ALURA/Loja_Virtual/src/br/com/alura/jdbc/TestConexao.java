package br.com.alura.jdbc;

import java.sql.Connection;

import java.sql.SQLException;

public class TestConexao {

    public static void main(String[] args) throws SQLException {
        Conector conectar = new Conector();
        Connection connection = conectar.conexao();

        System.out.println("\nFechando conexão!!");

        connection.close();
    }
}
