/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author misae
 */

public class PagamentoDinheiro implements Pagamento {

    private double valor; // valor da compra

    //método construtor
    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    // método para calcular o total com a aplicação do 10% de desconto
    @Override //sobrescreve
    public double calcularTotal() {
        return valor * 0.90; // ou seja, aplica 10% de desconto
    }

    //método para imprimir o recibo
    @Override //sobrescreve
    public void imprimirRecibo() {
        System.out.println("---- Recibo de Pagamento em Dinheiro ----");
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Desconto de 10% aplicado.");
        System.out.println("Total a pagar: R$ " + calcularTotal());
        System.out.println("------------------------------------------");
    }
}