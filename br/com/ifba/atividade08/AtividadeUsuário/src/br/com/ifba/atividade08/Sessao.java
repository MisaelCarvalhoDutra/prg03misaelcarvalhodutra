package br.com.ifba.atividade08;

public class Sessao {
    
    // aqui temos o atributo que vai armazenar o usuário logado.
    //outro relacionamento entre classes, pois se relaciona com a classe Usuario
    private Usuario usuario;
    
    private Long id;
    private String token;

    // aqui o método contrutor pra receber um usuário
    //faz a associação com usuario quando a sessão é criada
     public Sessao(Long id, Usuario usuario, String token){
        this.id = id;
        this. usuario = usuario;
        this.token = token;
    }

    // aqui apenas um método construtor por padrão
    public Sessao() {
        
    }

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

    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }

    // Vai sobrescrever o método toString(), para mostrar de forma mais clara as informações sobre tal sessão
    @Override
    public String toString() {
        if (usuario!= null) {
            return "Sessao ativa para: " + usuario.getNomeUsuario() 
                   + " (Perfil: " + usuario.getPerfil().getDescricao() + ")";
        } else {
            return "Sessao sem usuario logado";
        }
    }
}