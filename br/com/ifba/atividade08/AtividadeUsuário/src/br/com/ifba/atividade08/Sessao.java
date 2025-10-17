package br.com.ifba.atividade08;

public class Sessao {
    
    // aqui temos o atributo que vai armazenar o usuário logado.
    //outro relacionamento entre classes, pois se relaciona com a classe Usuario
    private Usuario usuarioLogado;

    // aqui o método contrutor pra receber um usuário
    //faz a associação com usuario quando a sessão é criada
    public Sessao(Usuario usuario) {
        this.usuarioLogado = usuario;
        System.out.println("Sessao iniciada para: " + usuario.getNome());
    }

    // aqui apenas um método construtor por padrão
    public Sessao() {
        
    }

    // Temos esse método para login, pra tentar logar o usuario
    public boolean login(Usuario usuario, String senha) {
        
        //compara senhas
        if (usuario.getSenha().equals(senha)) { //se for igual, guarda usuario como logado 
            
            this.usuarioLogado = usuario;
            System.out.println("Login realizado com sucesso: " + usuario.getNome());
            return true; //logo, login feito
        } else {
            System.out.println("Senha incorreta para o usuario: " + usuario.getNome());
            return false; //senão, login falhou
        }
    }

    // aqui o método para logout, pra encerrar sessão
    public void logout() {
        if (usuarioLogado != null) {
            System.out.println("Logout realizado: " + usuarioLogado.getNome());
            usuarioLogado = null; //logo, removemos o usuario
        } else {
            System.out.println("Nenhum usuario está logado.");
        }
    }

    // temos esse método getter para termos o usuário logado.
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    // Vai sobrescrever o método toString(), para mostrar de forma mais clara as informações sobre tal sessão
    @Override
    public String toString() {
        if (usuarioLogado != null) {
            return "Sessao ativa para: " + usuarioLogado.getNome() 
                   + " (Perfil: " + usuarioLogado.getPerfil().getNomePerfil() + ")";
        } else {
            return "Sessao sem usuario logado";
        }
    }
}