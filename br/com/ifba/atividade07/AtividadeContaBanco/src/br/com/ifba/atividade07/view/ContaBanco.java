package br.com.ifba.atividade07.view;


public class ContaBanco {
    
    //esses são os atributos
    public int numConta;
    protected String tipo; //CC ou CP
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos:
    
    public void estadoAtual(){ //pra mostrar como está atualmente
        
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true); //a conta passa a ser aberta
        
        if (t == "CC") { //verifica se é conta corrente ou poupança
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        
        System.out.println("Conta foi aberta!!");
    }
    
    //vai fechar a conta, desde que não tenha saldo
    public void fecharConta(){
        if(this.getSaldo() > 0){ //se for positivo, não fecha a conta
            System.out.println("Conta não pode ser fechada, pois ainda há saldo");
        } else if(this.getSaldo() < 0){ //se for negativo, não fecha a conta
            System.out.println("Conta não pode ser fechada, pois tem débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta foi fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if(this.getStatus()){ //verifica se a conta está aberta, para poder depositar
            
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito foi realizado na conta de " + this.getDono());
        }else{ // se não estiver, mostra mensagem
            System.out.println("Não é possível depositar em uma conta fechada!");
        }
            
    }
    
    public void sacar(float valor){
        if(this.getStatus()){ //verifica se a conta esta aberta
            if(this.getSaldo() >= valor){ //verifica se o valor atual é maior que o valor que deseja sacar
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("O Saque foi realizado na conta de " + this.getDono());
            }else{ //se não for, mostra mensagem que não é possivel realizar saque
                System.out.println("O Saldo é insuficiente para saque!");
            }
        }else{ 
            System.out.println("É Impossível sacar de uma conta fechada!!");
        }
            
    }
    
    public void pagarMensal(){ //vai cobrar a mensalidade de acordo com o tipo
        int valor = 0;
        
        if (this.getTipo() == "CC") {
            valor = 12;
        }else if(this.getTipo() == "CP"){
            valor = 20;
        }
        
        if (this.getStatus()){ //verifica se está aberta a conta
            this.setSaldo(this.getSaldo() - valor); //subtrai o valor da mensalidade
            System.out.println("A Mensalidade foi paga com sucesso por " + this.getDono());
        }else{
            System.out.println("É Impossível pagar uma conta fechada");
        }
    }
    
    //agora os Métodos especiais:

    public ContaBanco() { //método construtor
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
     
    
    
}
