package Pucrs.TF;

public class Membro {
  private int Matricula_Membro = 0;
  private String Nome_Membro = "Sem nome.";
  private String Cidade_Membro = "Sem Cidade";
  private int Bicicleta_emprestada;
  
public Membro(int Matricula_Membro, String Nome_Membro, String Cidade_Membro){
Bicicleta_emprestada = -1;
this.Matricula_Membro = Matricula_Membro;
this.Nome_Membro = Nome_Membro;
this.Cidade_Membro = Cidade_Membro;
}
public int getMatricula(){ return Matricula_Membro;}
public String getNome(){ return Nome_Membro; }
public String getCidade(){ return Cidade_Membro; }


public void setNome(String nome){ Nome_Membro = nome;}
public void setMatricula(int matricula){ Matricula_Membro = matricula; }
public void setCidade(String cidade){ Cidade_Membro = cidade; }
public void setBicicleta(int Codigo){ Bicicleta_emprestada = Codigo; }


public String toString(){
    return " Nome: " + Nome_Membro + "\n CPF: " + Matricula_Membro + "\n Cidade: " + Cidade_Membro+"\n Código da bicicleta emprestada?(-1 nao possui) "+Bicicleta_emprestada;
}

}