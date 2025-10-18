package br.com.ifba.atividade08;

import java.time.LocalDateTime;

public class Usuario {
    
    // aqui os atributos todos privados
    private Long id;
    private String nomeUsuario; // nome do usuário
    private String email;
    private String senha;
    private PerfilUsuario perfil; // está associado com PerfilUsuario, ou seja, o relacionamento entre classes
    
    private LocalDateTime ultimoLogin;
    private Boolean ativo;

    // construtor padrão aqui
    public Usuario() {  
        
    }

    // aqui o método construtor completo
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, LocalDateTime ultimoLogin, Boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ultimoLogin = ultimoLogin;
        this.ativo = ativo;
    }

    // aqui os métodos getters e setters (encapsulamento)
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }


    // vai sobrescrever o método toString para imprimir de forma mais organizado
 
    @Override
    public String toString() {
        return "Usuario [ID = " + id 
               + ", Nome = " + nomeUsuario 
               + ", Email = " + email 
               + ", Perfil = " + perfil.getDescricao() + "]";
    }

  
}