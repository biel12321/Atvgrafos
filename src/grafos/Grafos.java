/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import javax.swing.JOptionPane;

/**
 *
 * @author DEV
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Menu
        menu();
    }
    
    public static void menu(){
        int opcao = 0;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("-----------------------ATIVIDADES DE GRAFOS-----------------------"
                + "\n| 0 - Sair                      "
                + "                                                                     |"
                + "\n| 1 - Grafo ordenado                                                                     |"
                + "\n| 2 - Grafo não-ordenado                                                             |"
                + "\n--------------------------------------------------------------------------------"
                + "\nInsira a opção desejada:"));
        
        switch(opcao){
            case 1:
                ordenado();
                break;
            
            case 2:
                nao_ordenado();
                break;
                
            case 0:
                JOptionPane.showMessageDialog(null, "Volte sempre!");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida\n Selecione uma nova opção");
                menu();
                break;
        }
        
    }

    //Metodo de Resolução da primeira opção
    private static void nao_ordenado() {
        if(valoradoOuNaoValorado()==1){
            //Valorado
            listadeArestas(true);
            listadeAdjacentes(true);
            matrizAdjacente(true);
            matrizInsidencia(true);
        } else {
            //Não_Valorado
            listadeArestas(false);
            listadeAdjacentes(false);
            matrizAdjacente(false);
            matrizInsidencia(false);
        }
    }
    
    //Metodo de Resolução da segunda opção
    private static void ordenado() {
        if(valoradoOuNaoValorado()==1){
            //Valorado
            
        } else {
            //Não_Valorado
            
        }
    }
    
    public static int valoradoOuNaoValorado(){
        int orientado = 0;
        orientado = Integer.parseInt(JOptionPane.showInputDialog(null, "Este grafo sera valorado?"
                + "\n 0 - Não\n 1 - Sim"));
        if(orientado!=0 && orientado!= 1){
            JOptionPane.showMessageDialog(null, "Opção invalida");
            valoradoOuNaoValorado();
        } else {
            return orientado;
        }
        return 0;
    }

    private static void listadeArestas(boolean b) {
        if(b){
            int opcao = 0;
            boolean flag;
            do{
                double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do grafo:"));
                //Codigo...
                
                
                
                opcao = JOptionPane.showConfirmDialog(null, "Escolha sim ou não", "Sim ou não?", JOptionPane.YES_NO_OPTION);
                flag = opcao == JOptionPane.YES_OPTION;
            }while( flag );
        } else {
            
        }
    }

    private static void listadeAdjacentes(boolean b) {
        
    }

    private static void matrizAdjacente(boolean b) {
        
    }

    private static void matrizInsidencia(boolean b) {
        
    }
}
