package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    //Nome do usuário do mysql
    private static final String USERNAME = "root";

    //senha do banco
    private static final String PASSOWORD = "google1234";

    //caminho do banco de dado, porta e o nome do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://34.95.159.24:3306/db_livraria_esm";


    public static Connection createConeConnectionToMySQL() throws Exception {
        //faz com que a clase seja carregada pela JVM
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSOWORD);

        return connection;
    }
}

