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
        
    }
    
    //Metodo de Resolução da segunda opção
    private static void ordenado() {
        
    }
    
    
}
