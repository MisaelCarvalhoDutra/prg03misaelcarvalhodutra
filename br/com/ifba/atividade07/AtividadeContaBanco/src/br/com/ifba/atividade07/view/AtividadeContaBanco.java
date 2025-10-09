package br.com.ifba.atividade07.view;

public class AtividadeContaBanco {

    public static void main(String[] args) {
        
       ContaBanco c1 = new ContaBanco(); //criando Conta (objeto) 
       c1.setNumConta(001);
       c1.setDono("Jubileu");
       c1.abrirConta("CC");
       
       ContaBanco c2 = new ContaBanco();
       c2.setNumConta(002);
       c2.setDono("Creusa");
       c2.abrirConta("CP");
       
       c1.depositar(250);
       c2.depositar(450);
       
       c1.sacar(200);
       c2.sacar(400);
       
       c2.sacar(200);
       c2.fecharConta();
       
       
       c1.estadoAtual();
       c2.estadoAtual();
       
    }
    
}
