package br.com.alura.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Conector{


        public DataSource dataSource;

    public Conector() {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/SUCOS?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("admin");
        comboPooledDataSource.setPassword("password");

        this.dataSource =  comboPooledDataSource;
    }

    public Connection conexao() throws SQLException {
       return this.dataSource.getConnection();
    }
}
