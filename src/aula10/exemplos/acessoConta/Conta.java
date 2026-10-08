package aula10.exemplos.acessoConta;

import java.util.Random;

public class Conta {
  //Não pode alterar
  private String identificador;
  //Pode alterar e ler
  private String titular;
  //Só deve ser alterado pelo sacar e depositar
  //Lido pelo verificaSaldo
  private double saldo;
  //Pode ser alterado
  private String senha;

  // Criando um construtor para classe Conta que exija um titular e uma senha
  public Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    identificador = geraIdentificador();
    saldo = 0;
  }

  public String getTitular(){
    return titular;
  }

  public void setTitular(String titular){
    this.titular = titular;
  }

  public void setSenha(String senha){
    this.senha = senha;
  }

  public String getIdentificador(){
    return identificador;
  }

  public boolean validarAcesso(String identificador, String senha){
    return this.identificador.equals(identificador) && this.senha.equals(senha);
  }

  private String geraIdentificador(){
    Random aleatorio = new Random();
    String identificador = "";
    for (int i = 0; i < 4; i++) {
      identificador += (char) aleatorio.nextInt(65,90);
    }

    identificador+=aleatorio.nextInt(1000,9999);
    return identificador;
  }

  public boolean sacar(double valor){
    if(valor<=saldo){
      saldo-=valor;
      return true;
    }
    return false;
  }

  public void depositar(double valor){
    if(valor>0)
      saldo+=valor;
  }

  public String verificaSaldo(){
    return "Seu saldo é de R$ %.2f".formatted(saldo);
  }

}
