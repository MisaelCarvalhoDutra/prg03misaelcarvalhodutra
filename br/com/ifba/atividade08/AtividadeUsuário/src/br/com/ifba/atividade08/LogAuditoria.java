package br.com.ifba.atividade08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogAuditoria {
    
    //aqui os atributos como privados, para acesso depois com métodos getters e setters (encapsulamento)
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
    private Long id;

    //aqui o método construtor padrão
    public LogAuditoria(){   
    }
    
    // o método contrutor para inicializar
    public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
    this.id = id;
    this.usuario = usuario;
    this.acao = acao;
    this.dataHora = dataHora;
    this.ip = ip;
    
    }

    // aqui os métodos getters e setters para acesso e alteração dos atributos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    

    // vai sobrescrever o método toString para imprimir as informações do log de forma mais organizada
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "LogAuditoria [Usuario = " + usuario.getNomeUsuario() 
               + ", Acao = " + acao 
               + ", DataHora = " + dataHora.format(formatter) + "]";
    }
}