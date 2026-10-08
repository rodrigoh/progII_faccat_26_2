package aula10.exemplos.heranca;

// Para usar herança em Java usamos o extends
public class Motorista extends Colaborador{

  public Motorista(String nome, String sobrenome, String mail){
    // O construtor da sublcasse Motorista chama o construtor da supleclasse Colaborador
    super(nome,sobrenome,mail);
  }
  private String cnh;

  public String getCnh(){
    return cnh;
  }

  public void setCnh(String cnh){
    this.cnh = cnh;
  }
}
