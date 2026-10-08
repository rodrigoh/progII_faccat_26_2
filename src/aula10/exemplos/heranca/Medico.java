package aula10.exemplos.heranca;

public class Medico extends Colaborador{
  private String crm;

  public Medico(String nome, String sobrenome, String mail, String crm) {
    super(nome, sobrenome, mail);
    this.crm = crm;
  }

  public String getCrm() {
    return crm;
  }

  public void setCrm(String crm) {
    this.crm = crm;
  }

  public void calculaSalario(){
    salario = salario*1.5;
  }
}
