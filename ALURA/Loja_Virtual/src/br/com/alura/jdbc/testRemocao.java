package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class testRemocao {

    public static void main(String[] args) throws SQLException {

        Conector estabelecer = new Conector();
        Connection connection = estabelecer.conexao();

        PreparedStatement stm = connection.prepareStatement("DELETE FROM tbPRODUTO WHERE PRODUTO = ?");

        stm.setString(1, "1002334");
        stm.execute();

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println("Quantidade de linhas que foram modificadas " + linhasModificadas);

    }
}