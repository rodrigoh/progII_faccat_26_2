package aula09.exemploConta;

public class Banco {
  static void main() {
    Conta c1 = new Conta("Jonas", "123456");
    IO.println("Conta cadastrada obteve o identificador "+c1.identificador);

    String identificador = IO.readln("Qual conta deseja acessar: ");
    String senha = IO.readln("Qual a senha: ");
    if(c1.validarAcesso(identificador, senha)){
      char opc;
      do{
        IO.println("Bem vindo "+c1.titular);
        IO.println("Selecione uma opção: ");
        IO.println("d - depositar");
        IO.println("s - sacar");
        IO.println("v - verificar saldo");
        IO.println("e - sair");
        opc = IO.readln().toLowerCase().charAt(0);
        if(opc=='d'){
          double valor = Double.parseDouble(IO.readln("Qual valor depositar: "));
          c1.depositar(valor);
        }
        else if(opc=='s'){
          double valor = Double.parseDouble(IO.readln("Qual valor sacar: "));
          if(c1.sacar(valor)){
            IO.println("Saque realizado");
          }
          else{
            IO.println("Saldo insuficiente");
          }
        }
        else if(opc=='v'){
          IO.println(c1.verificaSaldo());
        }
      }
      while (opc!='e');
    }
  }
}
