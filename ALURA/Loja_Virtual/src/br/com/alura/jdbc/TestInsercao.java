package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsercao {
    public static void main(String[] args) throws SQLException {

        Conector estabelecer = new Conector();
        Connection connection = estabelecer.conexao();

        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO  tbPRODUTO (PRODUTO, NOME, PRECO_LISTA) VALUES ('1000335', 'Test tes', '5.99')",
                 Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = stm.getGeneratedKeys();

        while(rst.next()) {
            String produto = rst.getString(1);
            System.out.println("O produto criado foi: " + produto);

        }
    }
}
