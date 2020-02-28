/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author luis
 */
public class Gravacao {
    private int idTipodeGravacao;
    private String TipodeGravacao;

    public int getIdTipodeGravacao() {
        return idTipodeGravacao;
    }

    public String getTipodeGravacao() {
        return TipodeGravacao;
    }

    public Gravacao(int idTipodeGravacao, String TipodeGravacao) {
        this.idTipodeGravacao = idTipodeGravacao;
        this.TipodeGravacao = TipodeGravacao;
    }

    public void setTipodeGravacao(String TipodeGravacao) {
        this.TipodeGravacao = TipodeGravacao;
    }

    public void setIdTipodeGravacao(int idTipodeGravacao) {
        this.idTipodeGravacao = idTipodeGravacao;
    }

    public Gravacao(String TipodeGravacao) {
        this.TipodeGravacao = TipodeGravacao;
    }

    public Gravacao() {
    }

    @Override
    public String toString() {
        return TipodeGravacao;
    }
    
    
}
