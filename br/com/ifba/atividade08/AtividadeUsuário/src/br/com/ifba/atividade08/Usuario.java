package br.com.ifba.atividade08;

public class Usuario {
    
    //aqui os atributos todos privados
    private int id;
    private String nome;
    private String email;
    private String senha;
    private PerfilUsuario perfil; //está associado com PerfilUsuario, ou seja, o relacionamento entre classes

    // aqui o método construtor
    public Usuario(int id, String nome, String email, String senha, PerfilUsuario perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    // aqui os métodos getters e setters (encapsulamento
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    // Método para mostrar as informações do usuário.
    // Ele faz o acesso ao nome do perfil de dentro do objeto PerfilUsuario
    public void exibirUsuario() {
        System.out.println("ID: " + id 
                           + ", Nome: " + nome 
                           + ", Email: " + email 
                           + ", Perfil: " + perfil.getNomePerfil());
    }

    // vai sobrescrever o método toString para imprimir de forma mais direta
    @Override
    public String toString() {
        return "Usuario [ID = " + id 
               + ", Nome = " + nome 
               + ", Email = " + email 
               + ", Perfil = " + perfil.getNomePerfil() + "]";
    }
}