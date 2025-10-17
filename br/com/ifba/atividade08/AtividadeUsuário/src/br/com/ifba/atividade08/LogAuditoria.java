package br.com.ifba.atividade08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogAuditoria {
    
    //aqui os atributos como privados, para acesso depois com métodos getters e setters (encapsulamento)
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;

    // o método contrutor para inicializar
    public LogAuditoria(Usuario usuario, String acao) {
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = LocalDateTime.now(); // vai registrar o momento da ação automaticamente, a data e a hora
    }

    // aqui os métodos getters e setters para acesso e alteração dos atributos
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // esse método é para mostrar o log, pra exibir
    public void exibirLog() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(usuario.getNome() + " - " + acao + " - " + dataHora.format(formatter));
    }

    // vai sobrescrever o método toString para imprimir as informações do log de forma mais organizada
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "LogAuditoria [Usuario = " + usuario.getNome() 
               + ", Acao = " + acao 
               + ", DataHora = " + dataHora.format(formatter) + "]";
    }
}