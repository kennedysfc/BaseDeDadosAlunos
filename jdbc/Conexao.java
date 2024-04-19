package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  public static Connection obterConexao(){
    Connection con = null;

    try {
      con = DriverManager.getConnection("jdbc:mysql://localhost/basedadosalunos","root","admin");
      System.out.println("BANCO DE DADOS CONECTADO COM SUCESSO !!");
    } catch (SQLException e) {
      System.out.println("NÃO FOI POSSIVEL CONECTAR O BANCO DE DADOS !! ");
      e.printStackTrace();
    }

    return con;
  }

}

