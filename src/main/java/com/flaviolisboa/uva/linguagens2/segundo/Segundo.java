package com.flaviolisboa.uva.linguagens2.segundo;

public class Segundo {

    public static void main(String[] args) {
        Tela tela = new Tela();
        Cliente cliente = new Cliente();
        
        tela.exibirTelaLogin();
        cliente.setNome(tela.getNome());
        cliente.setSenha(tela.getSenha());
        
        if (cliente.getSenha().equals("123")) {
            tela.setCliente(cliente);
        }
        
        tela.exibirTelaInicial();
    }
}
