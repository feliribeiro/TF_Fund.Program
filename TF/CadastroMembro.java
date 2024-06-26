package Pucrs.TF;

public class CadastroMembro {
private Membro [] vetor;
private int index;

public CadastroMembro(){
  //criação de vetor de objetos
  vetor = new Membro[10];
  index = 0;
}
//Verifica se há espaço disponível no vetor. 
    //Se houver, o objeto Gato é adicionado ao vetor na posição index e esta 
    //é incrementada. Se o vetor estiver cheio retorna false.
    public boolean adicionaNoVetor(Membro c){
      if(index >= vetor.length){
          return false;
      } else {
          vetor[index] = c;
          index++;
          return true;
      }
  }
  //Percorre o vetor e verifica se o objeto g está nele. Se o objeto for 
  //encontrado, o método retorna a posição em que foi encontrado. 
  //Senão retorna -1 para indicar que o objeto não foi encontrado.
   public int localizaMembro(Membro g) 
   {  int local=-1;
       for(int i=0; i<index; i++)
       {
          if(vetor[i]==g){local=i;}            
                    
      }
      return local;
  }
  
  //remove o objeto Gato especificado do vetor. Encontra a posição do 
  //objeto usando o método localizaGato(g), desloca todos os elementos 
  //subsequentes uma posição para a esquerda e decrementa o valor de index.
  //Retorna true para indicar que a remoção foi realizada com sucesso.
  public boolean removeMembro(Membro g)
  {
      int posicao= localizaMembro(g);
             {
              for(int i= posicao; i<index-1; i++){
                  vetor[i] = vetor[i+1];
              }
              vetor[index-1] = null;      
              index--;        
              return true; 
          }
  }
      //imprime o vetor    
      public void imprimeVetor(){
      for(int i=0; i<index; i++){
          System.out.println("\nCadastro de Membros na posicao" + (i+1)+ "\n********* ** ***** ** *******");            
          System.out.println(vetor[i].toString());
          System.out.println("********* ** ***** ** *******");
      }        
  }
  public int ProcuraMembro(String g){
        int local=-1;
        for(int i=0; i<index; i++)
        {
           if(vetor[i].getNome().equals(g)){local=i;}            
                     
       }
       return (local + 1);
   }
}