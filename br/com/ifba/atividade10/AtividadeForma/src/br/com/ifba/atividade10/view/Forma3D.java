package br.com.ifba.atividade10.view;



 //já aqui representa a forma tridimensional
 //Logo vai exigir que as subclasses implementem área e volume.
public abstract class Forma3D extends Forma {
    public Forma3D(String nome) {
        super(nome); //aqui vai chamar o construtor da classe mãe, já pra inicializar o nome
    }

    //aqui mostra que toda forma 3D precisa saber calcular sua área, e seu volume
    @Override
    public abstract double obterArea();

    public abstract double obterVolume();
}
