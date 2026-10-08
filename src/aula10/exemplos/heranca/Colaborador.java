package aula10.exemplos.heranca;

import java.time.LocalDate;

public class Colaborador {
  private String nome;
  private String sobrenome;
  private String mail;
  protected double salario;
  private String telefone;
  private String endereco;
  private LocalDate dataContrato;

  public Colaborador(String nome, String sobrenome, String mail){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.mail = mail;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public LocalDate getDataContrato() {
    return dataContrato;
  }

  public void setDataContrato(LocalDate dataContrato) {
    this.dataContrato = dataContrato;
  }
}
