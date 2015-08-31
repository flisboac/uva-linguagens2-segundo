package com.flaviolisboa.uva.linguagens2.segundo;

public class Cliente extends Pessoa {
    
    private String senha;
    
    @Override
    public void setNome(String nome) {
        super.setNome("Sr(a). " + nome);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
