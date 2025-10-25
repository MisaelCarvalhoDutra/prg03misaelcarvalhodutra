package br.com.ifba.atividade10.view;

public abstract class Forma {
    private String nome;

    // aqui é o método construtor
    public Forma(String nome) {
        this.nome = nome;
    }

    // vai retornar o nome da forma
    public String getNome() {
        return nome;
    }

    //método abstrato
    //sabendo que toda forma tem que saber fazer o cálculo da sua área
    public abstract double obterArea();

    //aqui é o método padrão
    //coloca volume = 0 (no caso para as subclasses 3D)
    public double obterVolume() {
        return 0.0;
    }

    //aqui o método toString, que vai mostrar uma descrição sobre a devida forma.
    @Override
    public String toString() {
        return "Forma: " + nome;
    }
    
}