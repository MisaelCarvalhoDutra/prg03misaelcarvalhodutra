package br.com.ifba.atividade08;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class AtividadeUsuario {
    public static void main(String[] args) {

        // aqui  temos a criação das permissões do perfil "Admin"
        List<String> permissoesAdmin = new ArrayList<>(); //criada lista vazia
        permissoesAdmin.add("Cadastrar usuario");
        
        permissoesAdmin.add("Excluir usuario");
        
        permissoesAdmin.add("Gerar relatorios");

        //aqui a criação das permissões do outro perfil , o "Comum"
        List<String> permissoesComum = new ArrayList<>();
        permissoesComum.add("Visualizar dados");
        permissoesComum.add("Alterar perfil");

        //criação dos perfis, com seus respectivos atributos e permissões
        PerfilUsuario admin = new PerfilUsuario(1L, "Admin", permissoesAdmin);
        PerfilUsuario comum = new PerfilUsuario(2L, "Comum", permissoesComum);

        //aqui a criação dos usuarios
        Usuario usuario1 = new Usuario(1L, admin, "Misael", "misael@email.com", "123456", null, true);
        Usuario usuario2 = new Usuario(2L, comum, "Bruna", "bruna@email.com", "abcdef", null, true);

        //aqui vai definir a data/hora exata do ultimo login que foi feito pelos usuarios
        usuario1.setUltimoLogin(LocalDateTime.now());
        usuario2.setUltimoLogin(LocalDateTime.now());

        
        //aqui temos a criação das duas sessões, associada com o usuario
        Sessao sessao1 = new Sessao(1L, usuario1, "token123");
        Sessao sessao2 = new Sessao(2L, usuario2, "token456");

        //aqui é a criação de uma lista pra guardar os registros das coisas realizadas pelos usuarios
        List<LogAuditoria> logs = new ArrayList<>();
        
        //e aqui vai adicionar esses registros, cada log tendo id, usuário, descrição da ação, data/hora e endereço ip.
        logs.add(new LogAuditoria(1L, usuario1, "Login realizado", LocalDateTime.now(), "192.168.0.10"));
        logs.add(new LogAuditoria(2L, usuario2, "Tentativa de acesso negada", LocalDateTime.now(), "192.168.0.11"));
        
        logs.add(new LogAuditoria(3L, usuario1, "Alterou senha", LocalDateTime.now(), "192.168.0.10"));

        //aqui é a parte de exibição das informações criadas:
        System.out.println("---- USUARIOS E PERFIS ----");
        System.out.println(usuario1);
        System.out.println(usuario2);

        System.out.println("\n---- PERMISSOES DOS PERFIS ----");
        System.out.println(admin.getDescricao() + ": " + admin.getPermissoes());
        System.out.println(comum.getDescricao() + ": " + comum.getPermissoes());

        System.out.println("\n---- SESSOES ATIVAS ----");
        System.out.println(sessao1);
        System.out.println(sessao2);

        System.out.println("\n---- LOGS DE AUDITORIA ----");
        for (LogAuditoria log : logs) {
            System.out.println(log);
        }
    }
}
