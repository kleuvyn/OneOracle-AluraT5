package br.com.alura.jdbc;

import java.sql.SQLException;

public class TestPool {

    public static void main(String[] args) throws SQLException {

        Conector conectar = new Conector();

        for (int i = 0; i < 20; i++){
           conectar.conexao();
            System.out.println("Conexao de número:" +i);
        }

    }
}
