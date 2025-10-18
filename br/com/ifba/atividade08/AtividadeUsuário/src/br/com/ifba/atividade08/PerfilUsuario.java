package br.com.ifba.atividade08;

import java.util.List; 

public class PerfilUsuario {
    
    //atributos private para acessar por meio dos getters e setters (encapsulamento)
    private Long id; 
    
    private String descricao; //substitui o nomePerfil, como "Admin" e etc
    
    private List<String> permissoes; //aqui é a lista de permissões do perfil
    
    //metodo construtor por padrão
    public PerfilUsuario() {
    
    }

    // Aqui temos o método construtor
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) { 
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes; 
    }

    // E aqui os métodos getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao; //pra alterar o nome do perfil
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) { 
        this.permissoes = permissoes;
    }

    // Método para exibir informações do perfil
    //metodo toString para deixar as informações organizadas para leitura do usuario
     public String toString() {
        return "PerfilUsuario [ id:" + id + 
               ", descricao: '" + descricao + 
               "', permissoes: " + permissoes + " ]"; //adicionado para mostrar as permissões também
    }

}
