package br.com.ifba.atividade10.view;


//aqui já temos a classe concreta do piramide
public class Piramide extends Forma3D { //classe piramide sendo subclasse de Forma2D
    private double base;
    private double altura;

    //aqui é o construtor do piramide, o qual recebe a base e altura como parametros
    public Piramide(double base, double altura) {
        super("Piramide"); //aqui vai chamar o construtor da classe mãe, já pra iniciar com o nome "Piramide"
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() { 
        double areaBase = base * base; //aqui vai calcular a area da base
        double areaLateral = 2 * base * Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2)); 
        //aqui temos o calculo da lateral
        
        return areaBase + areaLateral; //e aqui retornar a area total da piramide, q é a soma dos dois calculos
    }

    @Override
    public double obterVolume() { //e aqui vai retornar o volume
        return (base * base * altura) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + " (base = " + base + ", altura = " + altura + ")";
    }
    //aqui vai chamar o método toString da classe mãe, ou seja, a Forma3D
    // e vai retornar já adicionando o valor da base e tambem da altura na descrição
}
