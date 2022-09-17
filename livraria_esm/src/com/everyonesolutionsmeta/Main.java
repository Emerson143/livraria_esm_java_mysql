package com.everyonesolutionsmeta;

import dao.Conexao;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) throws Exception {
        //Recuperar uma conexão com o banco de dados
        Connection con = Conexao.createConeConnectionToMySQL();

        // testar se a conexão é nula
        if (con != null) {
            System.out.println("Conexão obetida com sucesso");
            con.close();
        }
    }
}

