package br.com.ifba.atividade10.view;


//Representa uma forma bidimensional, logo só necessita da área
 public abstract class Forma2D extends Forma { //que é o a subclasse de Forma
    public Forma2D(String nome) {
        
        super(nome); //aqui vai chamar o construtor da classe mãe, já pra inicializar o nome
    }

    
    @Override
    public abstract double obterArea();
    //aqui é método abstrato, uma vez que cada forma 2D vai ter sua propria forma de calcular sua área
}
