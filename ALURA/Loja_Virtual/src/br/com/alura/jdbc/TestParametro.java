package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestParametro {

    public static void main(String[] args) throws SQLException {

        Conector estabelecer = new Conector();
        Connection connection = estabelecer.conexao();
        connection.setAutoCommit(false);


        try (PreparedStatement stm =
                     connection.prepareStatement("INSERT INTO  tbPRODUTO (PRODUTO, NOME, PRECO_LISTA) VALUES ( ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
        ){
            adicionarVariavel("0996876", "Pepsi 1.5l", 9.99f, stm);
            adicionarVariavel("03684584", "Refri Limao 500Ml", 3.99f, stm);

            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ROLLBACK EXECUTADO");
            connection.rollback();
        }
    }


    private static void adicionarVariavel(String PRODUTO, String NOME, Float PRECO_LISTA, PreparedStatement stm) throws SQLException {
        stm.setString(1, PRODUTO);
        stm.setString(2, NOME);
        stm.setFloat(3, PRECO_LISTA);

        if(PRODUTO.equals("Sucos")) {
            throw new RuntimeException("Não foi possível adicionar o produto");
        }

        stm.execute();

        try(ResultSet rst = stm.getGeneratedKeys()){
            while(rst.next()) {
                String produto = rst.getString(1);
                System.out.println("O id criado foi: " + PRODUTO);
            }
        }
    }
}



