/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03misaelcarvalhodutra;

import br.com.ifba.atividade03.view.telaCalculator;
//importa a classe da interface "telasCalculator", que esta nesse pacote "br.com.ifba.atividade03.view

/**
 *
 * @author misae
 */
public class Prg03misaelcarvalhodutra {
    //esse é o Metodo principal

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //vai garantir que a tela seja criada na thread correta da interface grafica
        java.awt.EventQueue.invokeLater(new Runnable() {
            
        //essa parte aqui fica o que a gente quer rodar
        public void run() {
            
            //e nessa parte vai Criar a janela "telaCalculator" e manda aparecer na tela
            new telaCalculator().setVisible(true);
        }
    });

    }
    
}