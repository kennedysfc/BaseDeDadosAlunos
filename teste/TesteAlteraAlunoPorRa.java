package teste;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteAlteraAlunoPorRa {

  public static void main(String[] args) {

    Aluno aluno = new Aluno(4, "Maria Mariana", 10, 9, 8, 7);

    AlunoDao alunoDao = new AlunoDao();
    alunoDao.alteraAlunoPorRa(aluno);

  }

}
