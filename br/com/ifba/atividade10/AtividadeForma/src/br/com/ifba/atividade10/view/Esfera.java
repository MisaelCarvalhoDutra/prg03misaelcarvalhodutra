package br.com.ifba.atividade10.view;


//aqui já temos a classe concreta da esfera
public class Esfera extends Forma3D {
    private double raio;

    
    
    
    //aqui é o construtor da esfera, o qual recebe o raio como parametro
    public Esfera(double raio) {
        super("Esfera"); //aqui vai chamar o construtor da classe mãe, já pra iniciar com o nome "Esfera"
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * Math.pow(raio, 2); //aqui vai retornar a fórmula da area
    }

    @Override
    public double obterVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3); //e aqui vai retornar a formula do Volume
    }

    @Override
    public String toString() {
        return super.toString() + " (raio = " + raio + ")";
        //aqui vai chamar o método toString da classe mãe, ou seja, a Forma3D
        //retorna adicionando o valor do raio da esfera na descrição
    }
}
