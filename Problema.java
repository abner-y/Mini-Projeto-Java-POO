import java.util.ArrayList;

public class Problema extends Texto{

  //Atributos
  public int estado;
  

  private ArrayList<Sugestao> sugestoes = new ArrayList<Sugestao>();

  //Getters and Setters ArrayList
	public ArrayList<Sugestao> getSugestao() {
		return sugestoes;
	}

  public void insereSugestao (Sugestao sugestoes) {
		this.sugestoes.add(sugestoes);
	}

  //Getters and Setters
  
  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
 

  

  
 
}