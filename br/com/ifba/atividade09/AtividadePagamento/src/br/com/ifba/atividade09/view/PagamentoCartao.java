/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author misae
 */

public class PagamentoCartao implements Pagamento {

    private double valor; // aqui o atributo valor da compra

    // aqui o método construtor
    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    // aqui faz a implementação do método para calcular o total, com a taxa de 5%, por ser Cartão
    @Override //sobrescreve
    public double calcularTotal() {
        return valor * 1.05; // aqui aplica 5% a mais, que é a taxa
    }

    //método para imprimir o recibo
    @Override //sobrescreve
    public void imprimirRecibo() {
        System.out.println("---- Recibo de Pagamento com Cartão ---");
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Taxa de 5% aplicada.");
        System.out.println("Total a pagar: R$ " + calcularTotal());
        System.out.println("----------------------------------------");
    }
}
