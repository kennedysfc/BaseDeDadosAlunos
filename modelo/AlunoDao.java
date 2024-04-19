package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.Conexao;

public class AlunoDao {

  public void cadastra(Aluno aluno) {

    Connection con = Conexao.obterConexao();

    String sql = "INSERT INTO Aluno(nome,pri,seg,ter,qua,media,status_final) VALUES(?,?,?,?,?,?,?)";

    try {
      PreparedStatement preparador = con.prepareStatement(sql);
      preparador.setString(1, aluno.getNome());
      preparador.setDouble(2, aluno.getPri());
      preparador.setDouble(3, aluno.getSeg());
      preparador.setDouble(4, aluno.getTer());
      preparador.setDouble(5, aluno.getQua());
      preparador.setDouble(6, aluno.getMedia());
      preparador.setString(7, aluno.getStatusFinal());

      preparador.execute();

      preparador.close();

      System.out.println("ALUNO CADASTRADO COM SUCESSO!");

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }


  public List<Aluno> mostraTodosAlunos(){

    Connection con = Conexao.obterConexao();

    List<Aluno> alunos = new ArrayList<>();

    String sql = "SELECT * FROM Aluno";

    try {
    PreparedStatement preparador = con.prepareStatement(sql);
    ResultSet resultado = preparador.executeQuery();

    while(resultado.next()) {
      Aluno aluno = new Aluno();
      aluno.setRa(resultado.getInt("ra"));
      aluno.setNome(resultado.getString("nome"));
      aluno.setPri(resultado.getDouble("pri"));
      aluno.setSeg(resultado.getDouble("seg"));
      aluno.setTer(resultado.getDouble("ter"));
      aluno.setQua(resultado.getDouble("qua"));
      aluno.setMedia(resultado.getDouble("media"));
      aluno.setStatusFinal(resultado.getString("status_Final"));

      alunos.add(aluno);	
    }

  } catch (SQLException e) {
    e.printStackTrace();
  }

    return alunos;

  }


  public Aluno mostraAlunoPorRa(int ra) {

    Connection con = Conexao.obterConexao();

    Aluno aluno = null;

    String sql = "SELECT * FROM Aluno WHERE ra=?";

    try {
    PreparedStatement preparador = con.prepareStatement(sql);
    preparador.setInt(1, ra);

    ResultSet resultado = preparador.executeQuery();

    if(resultado.next()) {
      aluno = new Aluno();
      aluno.setRa(resultado.getInt("ra"));
      aluno.setNome(resultado.getString("nome"));
      aluno.setPri(resultado.getDouble("pri"));
      aluno.setSeg(resultado.getDouble("seg"));
      aluno.setTer(resultado.getDouble("ter"));
      aluno.setQua(resultado.getDouble("qua"));
      aluno.setMedia(resultado.getDouble("media"));
      aluno.setStatusFinal(resultado.getString("status_final"));
    }

  } catch (SQLException e) {
    e.printStackTrace();
  }

    return aluno;

  }


  public void excluiAlunoPorRa(int ra) {

    Connection con = Conexao.obterConexao();

    String sql = "DELETE FROM Aluno WHERE ra=?";

    try {
    PreparedStatement preparador = con.prepareStatement(sql);
    preparador.setInt(1, ra);

    preparador.execute();
    preparador.close();

    System.out.println("ALUNO EXCLUIDO COM SUCESSO!");

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }


  public void alteraAlunoPorRa(Aluno aluno) {

    Connection con = Conexao.obterConexao();

    String sql = "UPDATE Aluno SET nome=?, pri=?, seg=?, ter=?, qua=?, media=?, status_final=? WHERE ra=?";

    try {
        PreparedStatement preparador = con.prepareStatement(sql);
        preparador.setString(1, aluno.getNome());
        preparador.setDouble(2, aluno.getPri());
        preparador.setDouble(3, aluno.getSeg());
        preparador.setDouble(4, aluno.getTer());
        preparador.setDouble(5, aluno.getQua());
        preparador.setDouble(6, aluno.getMedia());
        preparador.setString(7, aluno.getStatusFinal());
        preparador.setInt(8, aluno.getRa());

        preparador.execute();
        preparador.close();

        System.out.println("ALUNO ALTERADO COM SUCESSO!");

      } catch (SQLException e) {
        e.printStackTrace();
      }
  }

}
