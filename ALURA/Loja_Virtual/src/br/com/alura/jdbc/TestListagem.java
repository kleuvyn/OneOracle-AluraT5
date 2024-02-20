package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class TestListagem {


        public static void main(String[] args) throws SQLException {

            Conector estabelecer = new Conector();
            Connection connection = estabelecer.conexao();

            PreparedStatement stm = connection.prepareStatement("SELECT PRODUTO, NOME, PRECO_LISTA FROM tbPRODUTO");
            stm.execute();

            ResultSet rst =stm.getResultSet();

            while(rst.next()) {
                System.out.println();
                String produto = rst.getString("PRODUTO");
                System.out.println(produto);
                String nome = rst.getString("NOME");
                System.out.println(nome);
                Float preco = rst.getFloat("PRECO_LISTA");
                System.out.println(preco);

            }

            connection.close();
        }
    }

