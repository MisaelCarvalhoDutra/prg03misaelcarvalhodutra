package br.com.ifba.atividade10.view;


public class AtividadeForma {

    public static void main(String[] args) {
       
        //aqui vai criar o vetor de 6 posiçoes
        Forma[] formas = new Forma[6];

        // cria um vetor de formas, ou seja, instancia cada forma q é concreta
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(6, 3);
        formas[3] = new Esfera(3);
        formas[4] = new Cubo(2);
        formas[5] = new Piramide(4, 6);

        //aqui vai percorrer pelo vetor mostrando as informações de cadauma das formas
        for (Forma f : formas) {
            
            //mostra a descrição da forma chamando o método toString()
            System.out.println(f.toString());

            // verifica, se a forma é 2D, vai mostrar apenas a area
            if (f instanceof Forma2D) {
                System.out.printf("Area: %.2f\n", f.obterArea());
            }
            // mas se for 3D, vai mostrar tanto a area quanto o volume
            else if (f instanceof Forma3D) {
                System.out.printf("Area: %.2f\n", f.obterArea());
                System.out.printf("Volume: %.2f\n", f.obterVolume());
            }

            System.out.println("-------------------------");
        }
    }
    
}
