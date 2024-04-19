package teste;

import modelo.Aluno;
import modelo.AlunoDao;

public class TesteCadastraAluno {

  public static void main(String[] args) {

    Aluno aluno = new Aluno("Antonia guimaraes", 10, 8, 5, 3);

    AlunoDao AlunoDao = new AlunoDao();
    AlunoDao.cadastra(aluno);

  }

}
