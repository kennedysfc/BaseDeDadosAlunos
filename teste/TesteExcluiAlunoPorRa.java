package teste;

import modelo.AlunoDao;

public class TesteExcluiAlunoPorRa {

  public static void main(String[] args) {

    AlunoDao alunoDao = new AlunoDao();
    alunoDao.excluiAlunoPorRa(1);


  }

}
