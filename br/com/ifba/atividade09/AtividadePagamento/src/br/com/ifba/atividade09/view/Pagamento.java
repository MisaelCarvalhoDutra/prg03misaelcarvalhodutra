/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author misae
 */
public interface Pagamento {
    
    // Método para calcular o valor final , já com desconto, taxa ou cashback
    double calcularTotal();

    // aqui é o método para imprimir o recibo
    void imprimirRecibo();
}
