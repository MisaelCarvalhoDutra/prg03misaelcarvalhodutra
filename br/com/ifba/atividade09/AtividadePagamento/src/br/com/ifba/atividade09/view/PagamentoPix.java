/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author misae
 */

public class PagamentoPix implements Pagamento {

    private double valor; //aqui o valor da compra

    //método construtor
    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    // Implementação do método para calcular o total, com os 2% de cashback
    @Override //sobrescreve
    public double calcularTotal() {
        return valor * 0.98; // vai pagar 98% do valor
    }

    // e aqui a implementação do método pra imprimir o recibo
    @Override //sobrescreve
    public void imprimirRecibo() {
        System.out.println("---- Recibo de Pagamento via Pix ----");
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Cashback de 2% aplicado.");
        System.out.println("Total a pagar: R$ " + calcularTotal());
        System.out.println("--------------------------------------");
    }
}
