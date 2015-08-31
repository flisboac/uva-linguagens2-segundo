package com.flaviolisboa.uva.linguagens2.segundo;

import java.util.Scanner;

public class Tela {
    
    private String nome;
    private String senha;
    private Cliente cliente;

    public void exibirTelaLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LOGIN");
        System.out.print("Usuário: ");
        this.nome = scanner.nextLine();
        System.out.print("Senha: ");
        this.senha = scanner.nextLine();
    }
    
    public void exibirTelaInicial() {
        if (cliente != null) {
            System.out.println("Bem vindo, " + cliente.getNome());
        } else {
            System.out.println();
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
