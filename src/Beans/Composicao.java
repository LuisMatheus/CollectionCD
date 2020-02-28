/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

public class Composicao {
    private int idComposicao;
    private String Descricao;

    public Composicao() {
    }

    public Composicao(int idComposicao, String Descricao) {
        this.idComposicao = idComposicao;
        this.Descricao = Descricao;
    }

    public Composicao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getIdComposicao() {
        return idComposicao;
    }

    public void setIdComposicao(int idComposicao) {
        this.idComposicao = idComposicao;
    }

    @Override
    public String toString() {
        return Descricao;
    }
    
}
