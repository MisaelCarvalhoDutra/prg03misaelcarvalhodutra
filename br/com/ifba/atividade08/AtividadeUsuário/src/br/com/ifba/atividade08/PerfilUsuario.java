package br.com.ifba.atividade08;

public class PerfilUsuario {
    
    //atributos private para acessar por meio dos getters e setters (encapsulamento)
    private int id;
    
    private String nomePerfil; // aqui é o nome do perfil, como "Admin" e etc..

    // Aqui temos o método construtor
    public PerfilUsuario(int id, String nomePerfil) {
        this.id = id;
        this.nomePerfil = nomePerfil;
    }

    // E aqui os métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil; //pra alterar o nome do perfil
    }

    // Método para exibir informações do perfil
    //é o método toString (vai retornar uma String formatada com as informações).
   @Override
    public String toString() {
    return "PerfilUsuario { " + 
           "id=" + id + 
           ", nomePerfil='" + nomePerfil + '\'' + 
           " }";
    }

}