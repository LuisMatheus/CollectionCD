/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

public class Faixas {

    private int idFaixas;
    private int NumerodaFaixa;
    private String Descricao;
    private int idTipodeGravacao;
    private int idCD;
    private int idComposicao;

    public Faixas() {
    }

    public Faixas(int NumerodaFaixa, String Descricao, int TipodeGravacao, int idCD, int idComposicao) {
        this.NumerodaFaixa = NumerodaFaixa;
        this.Descricao = Descricao;
        this.idTipodeGravacao = TipodeGravacao;
        this.idCD = idCD;
        this.idComposicao = idComposicao;
    }

    public Faixas(int idFaixas, int NumerodaFaixa, String Descricao, int TipodeGravacao, int idCD, int idComposicao) {
        this.idFaixas = idFaixas;
        this.NumerodaFaixa = NumerodaFaixa;
        this.Descricao = Descricao;
        this.idTipodeGravacao = TipodeGravacao;
        this.idCD = idCD;
        this.idComposicao = idComposicao;
    }

    public int getIdFaixas() {
        return idFaixas;
    }

    public void setIdFaixas(int idFaixas) {
        this.idFaixas = idFaixas;
    }

    public int getNumerodaFaixa() {
        return NumerodaFaixa;
    }

    public void setNumerodaFaixa(int NumerodaFaixa) {
        this.NumerodaFaixa = NumerodaFaixa;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getIdTipodeGravacao() {
        return idTipodeGravacao;
    }

    public void setIdTipodeGravacao(int idTipodeGravacao) {
        this.idTipodeGravacao = idTipodeGravacao;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
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
