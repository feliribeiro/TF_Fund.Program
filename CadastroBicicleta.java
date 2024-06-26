package Pucrs.TF;

public class CadastroBicicleta {
    private Bicicleta[] cadastro;
    private int contador;

    public CadastroBicicleta() {
        cadastro = new Bicicleta[10];
        contador = 0;
    }
    public boolean adicionaBicicleta(Bicicleta bicicleta){
        if(contador >= cadastro.length){
            return false;
        } else {
            cadastro[contador] = bicicleta;
            contador++;
            return true;
        }
    }
    public int buscaBicicletaPeloModelo(String modeloBicicleta){
        for (int i = 0; i < cadastro.length; i++) {
            if(cadastro[i].getModelo_Bicicleta().equals(modeloBicicleta)){
                return i;
            } } return -1; }

    public boolean buscaBicicletaPeloCodigo(int codigoBicicleta){
        for (int i = 0; i < cadastro.length; i++) {
            if(cadastro[i].getCodigo_Bicicleta() == codigoBicicleta){
                return true;
            }} return false;
        }

    // public int totalUnidades(){
    //     int totalDeUnidades = 0;

    //     for (int i = 0; i < cadastro.length; i++) {
    //         totalDeUnidades = totalDeUnidades + b1.getQuantidadeDeBicicletaDisponivel();
    //     }

    //     return totalDeUnidades;
    // }

    public void mostraBicicletas(){
        System.out.println("======================");
        System.out.println("Dados das bicicletas: ");
        
        for (int i = 0; i < contador; i++) {
            if (cadastro[i] != null) {
                System.out.println("======================");
                System.out.println(cadastro[i].toString());
            } else {
            }
        }
        System.out.println("======================");
    }
    public String totalUnidades(int j){
       int totalBikes = 0;
        for (int i = 0; i < contador; i++) {
        if (cadastro[i] != null) {
            totalBikes++;
    
    }        
        } return "o total de bicicletas disponíveis é: "+(totalBikes+j);   
    }
        }
    

