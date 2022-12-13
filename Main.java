
import java.util.ArrayList;
//Main somente para fins de teste
public class Main {

  public static void main(String[] args) {

    Funcionario funcionario1 = new Funcionario();
    funcionario1.setNome("Arthur");
    funcionario1.setSexo(0);
    funcionario1.setIdade(25);
    
    Sugestao sugestao1 = new Sugestao();
    sugestao1.setAplicada(false);
    sugestao1.setDescricao("Usar api de vendas");

    Sugestao sugestao2 = new Sugestao();
    sugestao2.setAplicada(true);
    sugestao2.setDescricao("Usar gerenciador de sistemas vx");

    Sugestao sugestao3 = new Sugestao();
    sugestao3.setAplicada(false);
    sugestao3.setDescricao("Usar gerenciador de sistemas f7z");

    funcionario1.setSugestao(sugestao1);
    funcionario1.setSugestao(sugestao2);
    funcionario1.setSugestao(sugestao3);

    Problema problema1 = new Problema();
    problema1.setDescricao("Arrumar o codigo de vendas");

    //Criei esses 2 problemas e mudei o estado deles só para ter exemplos instanciados,
    //da pra trocar os estados a partir de funcionario também depois de inserido o problema.
    Problema problema2 = new Problema();
    problema2.setDescricao("Trocar sistema do servidor");
    problema2.setEstado(3);

    Problema problema3 = new Problema();
    problema3.setDescricao("Atualizar o windows");
    problema3.setEstado(9);

    funcionario1.insereProblema(problema1);
    funcionario1.insereProblema(problema2);
    funcionario1.insereProblema(problema3);
    problema1.insereSugestao(sugestao1);
    problema2.insereSugestao(sugestao2);
    problema2.insereSugestao(sugestao3);

    System.out.println("Funcionario: " + funcionario1.getNome() + " | Sexo: " + funcionario1.getSexo() + " | Idade: "
        + funcionario1.getIdade());

    
    int i = 0;

    System.out.println("\n---------------------------------\n");

    while(funcionario1.getProblemas().size() > i) {

      System.out.println(" | Descricao do problema: " + funcionario1.getProblemas().get(i).getDescricao());
      System.out.println("Estado do problema: ");

      if(funcionario1.getProblemas().get(i).getEstado() == 0) {
        System.out.println("NOVO");
      }

      if(funcionario1.getProblemas().get(i).getEstado() == 3) {
        System.out.println("CANCELADO");
      }

      if(funcionario1.getProblemas().get(i).getEstado() == 9) {
        System.out.println("RESOLVIDO");
      }
      
      System.out.println("\n---------------------------------\n");

     

      i++;
    }

    i = 0;
    System.out.println("\n----------Sugestões dos Problemas---------\n");
    
    System.out.println("Problema 1 \n");
    while(problema1.getSugestao().size() > i) {
      System.out.println(" | Descricao da Sugestao: " +
      problema1.getSugestao().get(i).getDescricao());
      System.out.println("Estado da Solução: ");

      if(problema1.getSugestao().get(i).getAplicada() == false) {
          System.out.println("Não resolvido");
      } else {
          System.out.println("Resolvido");
      }
       System.out.println("\n------\n");
      i++;
    }
    i = 0;
    System.out.println("\n-----------------------\n");
    System.out.println("Problema 2 \n");
    while(problema2.getSugestao().size() > i) {
      System.out.println(" | Descricao da Sugestao: " +
      problema2.getSugestao().get(i).getDescricao());
      System.out.println("Estado da Solução: ");

      if(problema2.getSugestao().get(i).getAplicada() == false) {
          System.out.println("Não resolvido");
      } else {
          System.out.println("Resolvido");
      }
      System.out.println("\n------\n");
        i++;
    }
    i = 0;
    System.out.println("\n-----------------------\n");
    System.out.println("Problema 3 \n");
    while(problema3.getSugestao().size() > i) {
      System.out.println(" | Descricao da Sugestao: " +
      problema3.getSugestao().get(i).getDescricao());
      System.out.println("Estado da Solução: ");

      if(problema3.getSugestao().get(i).getAplicada() == false) {
          System.out.println("Não resolvido");
      } else {
          System.out.println("Resolvido");
      }
      System.out.println("\n------\n");
       i++;
    }
  }
  

}

