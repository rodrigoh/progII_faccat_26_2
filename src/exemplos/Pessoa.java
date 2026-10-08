package exemplos;

import java.time.LocalDate;

public class Pessoa {

  private String nome;
  private LocalDate data;


  public void setData(LocalDate data){
    this.data=data;
  }

  public LocalDate getData(){
    return data;
  }

}
