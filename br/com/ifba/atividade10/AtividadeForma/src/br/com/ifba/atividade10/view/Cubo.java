package br.com.ifba.atividade10.view;


//aqui já temos a classe concreta do cubo
public class Cubo extends Forma3D {
    private double lado;

    //aqui é o construtor do cubo, o qual recebe o lado como parametro
    public Cubo(double lado) {
        super("Cubo"); //aqui vai chamar o construtor da classe mãe, já pra iniciar com o nome "Cubo"
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return 6 * Math.pow(lado, 2); //aqui vai retornar a fórmula da area, ou seja, 6 * lado ao quadrado
    }

    @Override
    public double obterVolume() {
        return Math.pow(lado, 3); //e tambem aqui vai retornar a fórmula o volume, lado ao cubo
    }

    @Override
    public String toString() {
        return super.toString() + " (lado = " + lado + ")";
         //aqui vai chamar o método toString da classe mãe, ou seja, a Forma3D
        //retorna adicionando o valor do lado do  na descrição
    }
}
