package Pucrs.TF;
import java.util.*;

public class Clube {
    public static void main(String[] args) {
        Random r1 = new Random();
      
            Scanner in = new Scanner(System.in);
            int OpçãoUsuario;
            int m = 0;
            CadastroMembro CadastroMembro = new CadastroMembro();
            CadastroBicicleta CadastroBicicleta = new CadastroBicicleta();
    
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
                matricula1 = r1.nextInt(10000000,99999999);
              }
              Membro Membro1 = new Membro(matricula1, nome1, cidade1);
              boolean adicionado = (CadastroMembro.adicionaNoVetor(Membro1));
                    if (adicionado == true) {
                        System.out.println("*Membro Cadastrado!*");
                    } else {
                        System.out.println("Erro ao cadastrar membro! Vetor cheio.");
                    }
            }
            break;
            case 2: // Mostrar membros.
                if(OpçãoUsuario==2){
                CadastroMembro.imprimeVetor();
                }
            break;
            case 3: // Pesquisar membro por nome.
                if(OpçãoUsuario==3){
                    System.out.println("Qual membro deseja localizar?");
                    in.nextLine();
                    String SearchMembro = in.nextLine();
                       System.out.println("O membro "+SearchMembro+" se encontra na posição "+CadastroMembro.ProcuraMembro(SearchMembro)+" do vetor"); 
                }
            break;
            case 4: // Incluir bicicleta.
                if(OpçãoUsuario==4){
                    System.out.println("Digite o modelo da Bicicleta que deseja incluir:");
                    in.nextLine();
                    String modelo1 = in.nextLine();
                    System.out.println("Digite o código (Ou digite \"1\" para gerar um número aleatório)");
                    int codigo1 = in.nextInt();
                    if (codigo1 == 1){
                      codigo1 = r1.nextInt(1000,9999);
                    }
                    Bicicleta Bicicleta1 = new Bicicleta(modelo1, codigo1);
                    boolean adicionado = (CadastroBicicleta.adicionaBicicleta(Bicicleta1));
                          if (adicionado == true) {
                              System.out.println("*Bicicleta Cadastrada!*");
                          } else {
                              System.out.println("Erro ao cadastrar bicicleta! Vetor cheio.");
                          }
                  }
            break;
            case 5: // Mostrar bicicletas.
                if(OpçãoUsuario==5){
                    CadastroBicicleta.mostraBicicletas();
                }
            break;
            case 6: // Pesquisar bicicleta por modelo.
                if(OpçãoUsuario==6){
                    System.out.println("Qual modelo de bicicleta deseja localizar?");
                    in.nextLine();
                    String SearchModel_bici = in.nextLine();
                       System.out.println("Este modelo de bicicleta encontra-se na posicao "+(CadastroBicicleta.buscaBicicletaPeloModelo(SearchModel_bici)+1)+" do vetor"); 
                }
            break;
            case 7: //  Emprestar bicicleta.
                if(OpçãoUsuario==7){
                    System.out.println("Digite o código da bicicleta que deseja retirar:");
                    CadastroBicicleta.mostraBicicletas();
                    int escolha_bicicleta = in.nextInt();
                    if (CadastroBicicleta.buscaBicicletaPeloCodigo(escolha_bicicleta) == true){
                        System.out.println("Digite o seu CPF:");
                        int cpf = in.nextInt();
                        if (CadastroMembro.VerificaCpf(cpf) == true ) { 
                            if (CadastroMembro.BikeToMembro(cpf, escolha_bicicleta) == true){
                                System.out.println("Bicicleta emprestada!");
                    } else {
                        System.out.println("CPF não encontrado.");
                    }
                }
            }
        }
            break;
            case 8: // Devolver bicicleta.
                if(OpçãoUsuario==8){
                    System.out.println("Digite o código da bicicleta que deseja devolver:");
                    CadastroBicicleta.mostraBicicletas();
                    int escolha_bicicleta = in.nextInt();
                    if (CadastroBicicleta.buscaBicicletaPeloCodigo(escolha_bicicleta) == true){
                        System.out.println("Digite o seu CPF:");
                        int cpf = in.nextInt();
                        if (CadastroMembro.VerificaCpf(cpf) == true ) { 
                            if (CadastroMembro.BikeToMembroOFF(cpf) == true){
                                System.out.println("Bicicleta Devolvida!");
                            CadastroBicicleta.totalUnidades(-1);
                    } else {
                        System.out.println("CPF não encontrado.");
                    }
                }
            }           
       }
            break;
            case 9: // Quantidade total de unidades disponíveis no sistema de empréstimo.
                if(OpçãoUsuario==9){
                    System.out.println(CadastroBicicleta.totalUnidades(0));
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
    
