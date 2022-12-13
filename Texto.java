import java.util.Calendar;

public class Texto {

  //Atributos
  public int codigo;
  public String titulo;
  public String descricao;
  public Calendar dataDeCriacao;
  public String analise;


  //Getters and Setters
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Calendar getDataDeCriacao() {
    return dataDeCriacao;
  }

  public void setDataDeCriacao(Calendar dataDeCriacao) {
    this.dataDeCriacao = dataDeCriacao;
  }

  public String getAnalise() {
    return analise;
  }

  public void setAnalise(String analise) {
    this.analise = analise;
  }

  

}