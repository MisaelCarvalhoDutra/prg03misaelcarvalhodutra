package br.com.ifba.atividade08;

import java.util.ArrayList;
import java.util.List;

public class AtividadeUsuario {
    public static void main(String[] args) {
       
      
        PerfilUsuario admin = new PerfilUsuario(1, "Admin");
        PerfilUsuario comum = new PerfilUsuario(2, "Comum");
        //criamos os perfil dos usuarios

        
        Usuario usuario1 = new Usuario(1, "Misael", "misael@email.com", "123456", admin);
        Usuario usuario2 = new Usuario(2, "Bruna", "bruna@email.com", "abcdef", comum);
        //criamos agora os usuários em si, com seus atributos
        
        
       
        Sessao sessao1 = new Sessao(usuario1);
        Sessao sessao2 = new Sessao(usuario2);
        //criamos agora as sessões, cada usuario

        // aqui temos a lista para armazenar todos os logs de auditoria
        List<LogAuditoria> logs = new ArrayList<>();

        //aqui registra algumas ações que foram feitas pelo usuario, como:
        logs.add(new LogAuditoria(usuario1, "Login realizado"));
        
        logs.add(new LogAuditoria(usuario2, "Tentativa de acesso negada"));
        
        logs.add(new LogAuditoria(usuario1, "Alterou senha"));

        // e aqui mostra todas informações das sessões, dos usuarios e tambem dos logs de auditoria
        System.out.println("=== Usuarios e Perfis ===");
        System.out.println(usuario1);
        System.out.println(usuario2);

        System.out.println("\n=== Sessoes Ativas ===");
        System.out.println(sessao1);
        System.out.println(sessao2);

        System.out.println("\n=== Logs de Auditoria ===");
        for (LogAuditoria log : logs) {
            System.out.println(log);
        } 
    }
    
}