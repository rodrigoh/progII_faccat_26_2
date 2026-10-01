package aula09.exemploConta;

import java.util.Random;

public class Conta {
  String identificador;
  String titular;
  double saldo;
  String senha;

  // Criando um construtor para classe Conta que exija um titular e uma senha

  Conta(String titular, String senha){
    this.titular = titular;
    this.senha = senha;
    identificador = geraIdentificador();
    saldo = 0;
  }

  boolean validarAcesso(String identificador, String senha){
    return this.identificador.equals(identificador) && this.senha.equals(senha);
  }

  String geraIdentificador(){
    Random aleatorio = new Random();
    String identificador = "";
    for (int i = 0; i < 4; i++) {
      identificador += (char) aleatorio.nextInt(65,90);
    }

    identificador+=aleatorio.nextInt(1000,9999);
    return identificador;
  }

  boolean sacar(double valor){
    if(valor<=saldo){
      saldo-=valor;
      return true;
    }
    return false;
  }

  void depositar(double valor){
    if(valor>0)
      saldo+=valor;
  }

  String verificaSaldo(){
    return "Seu saldo é de R$ %.2f".formatted(saldo);
  }

}
