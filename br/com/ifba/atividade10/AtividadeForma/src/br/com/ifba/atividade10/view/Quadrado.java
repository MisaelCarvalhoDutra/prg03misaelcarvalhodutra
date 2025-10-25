package br.com.ifba.atividade10.view;


//aqui já temos a classe concreta do quadrado
public class Quadrado extends Forma2D {
    private double lado;

    //aqui é o construtor do quadrado, o qual recebe o lado como parametro
    public Quadrado(double lado) {
        super("Quadrado"); //aqui vai chamar o construtor da classe mãe, já pra iniciar com o nome "Quadrado"
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return lado * lado; //aqui vai retornar a fórmula da area(lado * lado)
    }

    @Override
    public String toString() {
        return super.toString() + " (lado = " + lado + ")";
        //aqui vai chamar o método toString da classe mãe, ou seja, a Forma2D
        //retorna adicionando o valor do lado do  na descrição
    }
}
