package Pucrs.TF;

import java.util.*;

public class Clube{
  public static void main(String[] args) {
    Random r1 = new Random();
  
        Scanner in = new Scanner(System.in);
        int OpçãoUsuario;
        int m = 0;
        CadastroMembro cm1 = new CadastroMembro();

while (m <= 0) {
System.out.println("Digite a opçao que desejas:");
System.out.println("1. Incluir membro" +"\n2. Mostrar membros" +"\n3. Pesquisar membro por nome" +"\n4. Incluir bicicleta" +"\n5. Mostrar bicicletas" + "\n6. Pesquisar bicicleta por modelo" +"\n7. Emprestar bicicleta" 
+"\n8. Devolver bicicleta" +"\n9. Quantidade total de unidades disponíveis no sistema de empréstimo"+"\n10. Sair do programa");
OpçãoUsuario = in.nextInt();
switch (OpçãoUsuario) {
    case 1: // Incluir membro.
        if(OpçãoUsuario==1){
            // incluir membro
          System.out.println("Digite o nome do membro que deseja incluir:");
          in.nextLine();
          String nome1 = in.nextLine();
          System.out.println("Digite a cidade do membro:");
          String cidade1 = in.nextLine();
          System.out.println("Digite o numero de matricula do membro (Ou digite \"1\" para gerar um número aleatório)");
          int matricula1 = in.nextInt();
          if (matricula1 == 1){
            matricula1 = r1.nextInt(1000,9999);
          }
          Membro m1 = new Membro(matricula1, nome1, cidade1);
          boolean adicionado = (cm1.adicionaNoVetor(m1));
                if (adicionado == true) {
                    System.out.println("*Membro Cadastrado!*");
                } else {
                    System.out.println("Erro ao cadastrar membro! Vetor cheio.");
                }
        }
        break;
        case 2: // Mostrar membros.
            if(OpçãoUsuario==2){
            cm1.imprimeVetor();
            }
        break;
        case 3: // Pesquisar membro por nome.
            if(OpçãoUsuario==3){
                // System.out.println("Qual membro deseja localizar?");
                // String SearchMembro = in.nextLine();
                
            }
        break;
        case 4: // Incluir bicicleta.
            if(OpçãoUsuario==4){

            }
        break;
        case 5: // Mostrar bicicletas.
            if(OpçãoUsuario==5){

            }
        break;
        case 6: // Pesquisar bicicleta por modelo.
            if(OpçãoUsuario==6){

            }
        break;
        case 7: //  Emprestar bicicleta.
            if(OpçãoUsuario==7){

            }
        break;
        case 8: // Devolver bicicleta.
            if(OpçãoUsuario==8){

            }
        break;
        case 9: // Quantidade total de unidades disponíveis no sistema de empréstimo.
            if(OpçãoUsuario==9){

            }
        break;

    case 10: // Sair do programa.
            if(OpçãoUsuario==10){
                m = 1;     
              
            }
            break;
    default: System.out.println("*Número incorreto* /nDigite uma opção entre 1 - 10.");
        break;}
}
in.close();
}
}
