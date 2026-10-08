package aula10.exemplos.exemploFinal;

public class Operacoes {
  // Ao definir uma variável como final
  // ela não poderá ser alterada
  // devo inicializar na declaração ou no construtor
  private final int valor;

  // O modificar final permite a criação de constantes
  // public -> acesso global
  // static -> existir diretamente na classe
  // final -> não poder ser alterada
  public static final double PI = 3.141592653589793;


  public Operacoes(int valor){
    this.valor = valor;
  }

  public int getValor(){
    return valor;
  }

// Esta operação não pode ser realizada.

//  public void setValor(int valor){
//    this.valor = valor;
//  }
}
