package br.com.ifba.atividade10.view;


//aqui já temos a classe concreta do triangulo
public class Triangulo extends Forma2D {
    private double base;
    private double altura;

    //aqui é o construtor do triangulo, o qual recebe a base e altura como parametros
    public Triangulo(double base, double altura) {
        super("Triangulo"); //aqui vai chamar o construtor da classe mãe, já pra iniciar com o nome "Triangulo"
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return (base * altura) / 2; //aqui vai retornar a fórmula da area
    }

    @Override
    public String toString() {
        return super.toString() + " (base = " + base + ", altura = " + altura + ")";
        //aqui vai chamar o método toString da classe mãe, ou seja, a Forma2D
        // e vai retornar já adicionando o valor da base a altura na descrição
    }
}
