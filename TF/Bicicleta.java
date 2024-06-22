package Pucrs.TF;

public class Bicicleta{
private int Codigo_bicicleta = 0;
private String Modelo_Bicicleta = "Sem modelo";
private int QuantidadeDeBicicletaDisponivel = 0; 

public Bicicleta(){

}
public int getCodigo_bicicleta(){
  return Codigo_bicicleta;
}
public String getModelo_Bicicleta(){
  return Modelo_Bicicleta;
}
public int QuantidadeDeBicicletaDisponivel(){
  return QuantidadeDeBicicletaDisponivel;
}
public void setCodigo_bicicleta(int CodeBike){
  Codigo_bicicleta = CodeBike;
}
public void setModelo_Bicicleta(String ModeloBike){
  Modelo_Bicicleta = ModeloBike;
}
public void setQuantidadeDeBicicletaDisponivel(int QuantidadeBike){
  QuantidadeDeBicicletaDisponivel = QuantidadeBike;
}
}
