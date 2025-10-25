package br.com.ifba.atividade10.view;


//aqui já temos a classe concreta do circulo
public class Circulo extends Forma2D { 
    private double raio; 

    //aqui é o construtor do circulo, o qual recebe o raio como parametro
    public Circulo(double raio) {
        super("Circulo"); //aqui vai chamar o construtor da classe mãe, já pra iniciar com o nome "Círculo"
        this.raio = raio;
    }

    @Override
    public double obterArea() { 
        return Math.PI * Math.pow(raio, 2); //aqui vai retornar a fórmula da area (pi * raio ao quadrado)
    }

    @Override //sobrescreve o método
    public String toString() {
        return super.toString() + " (raio = " + raio + ")";
        //aqui vai chamar o método toString da classe mãe, ou seja, a Forma2D
        //retorna adicionando o valor do raio do círculo na descrição
    }
}
