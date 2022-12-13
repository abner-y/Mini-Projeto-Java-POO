import java.util.ArrayList;

public class Funcionario {

  public String nome;
  public int sexo;
  public int idade;
  
  private Sugestao sugestao;

  private ArrayList<Problema> problemas = new ArrayList<Problema>();

  

  //Getters and Setters ArrayList
	public ArrayList<Problema> getProblemas() {
		return problemas;
	}
	
	public void insereProblema (Problema problema) {
		this.problemas.add(problema);
	}

  public Sugestao getSugestao() {
    return sugestao;
  }

  public void setSugestao(Sugestao sugestao) {
    this.sugestao = sugestao;
  }

  //Getters and Setters atributos padrões

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getSexo() {
    return sexo;
  }

  public void setSexo(int sexo) {
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
  

}