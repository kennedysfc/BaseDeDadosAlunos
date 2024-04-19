package modelo;

public class Aluno {

  public Aluno(String nome, double pri, double seg, double ter, double qua) {
    this.nome = nome;
    this.pri = pri;
    this.seg = seg;
    this.ter = ter;
    this.qua = qua;
    this.media = calcularMedia();
    this.statusFinal = verificarStatus();
  }

  public Aluno(int ra, String nome, double pri, double seg, double ter, double qua) {
      this.ra = ra;
      this.nome = nome;
      this.pri = pri;
      this.seg = seg;
      this.ter = ter;
      this.qua = qua;
      this.media = calcularMedia();
      this.statusFinal = verificarStatus();    
  }

  public Aluno() {}

  private int ra;
  private String nome;
  private double pri;
  private double seg;
  private double ter;
  private double qua;
  private double media;
  private String statusFinal;

  public double calcularMedia() {
    return (pri + seg + ter + qua) / 4;
  }

  public String verificarStatus() {

    if (media >= 7 && media <= 10) {
      return "APROVADO";
    } else if (media >= 5 && media < 7) {
      return "RECUPERAÇÃO";
    } else if (media >= 0 && media < 5) {
      return "REPROVADO";
    } else {
      return "NOTA INVÁLIDA!";
    }
  }

  public int getRa() {
    return ra;
  }

  public void setRa(int ra) {
    this.ra = ra;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPri() {
    return pri;
  }

  public void setPri(double pri) {
    this.pri = pri;
  }

  public double getSeg() {
    return seg;
  }

  public void setSeg(double seg) {
    this.seg = seg;
  }

  public double getTer() {
    return ter;
  }

  public void setTer(double ter) {
    this.ter = ter;
  }

  public double getQua() {
    return qua;
  }

  public void setQua(double qua) {
    this.qua = qua;
  }

  public double getMedia() {
    return media;
  }

  public void setMedia(double media) {
    this.media = media;
  }

  public String getStatusFinal() {
    return statusFinal;
  }

  public void setStatusFinal(String statusFinal) {
    this.statusFinal = statusFinal;
  }

}
