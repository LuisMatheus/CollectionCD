/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Date;

public class CD {
    private int idCD;
    private String Descricao;
    private Double PreçoDeCompra;
    private Date DatadaCompra;
    private Date DatadaGravacao;
    private int idLabel;

    public CD() {
    }

    public CD(String Descricao, Double PreçoDeCompra, Date DatadaCompra, Date DatadaGravacao, int idLabel) {
        this.Descricao = Descricao;
        this.PreçoDeCompra = PreçoDeCompra;
        this.DatadaCompra = DatadaCompra;
        this.DatadaGravacao = DatadaGravacao;
        this.idLabel = idLabel;
    }

    public CD(int idCD, String Descricao, Double PreçoDeCompra, Date DatadaCompra, Date DatadaGravacao, int idLabel) {
        this.idCD = idCD;
        this.Descricao = Descricao;
        this.PreçoDeCompra = PreçoDeCompra;
        this.DatadaCompra = DatadaCompra;
        this.DatadaGravacao = DatadaGravacao;
        this.idLabel = idLabel;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Double getPreçoDeCompra() {
        return PreçoDeCompra;
    }

    public void setPreçoDeCompra(Double PreçoDeCompra) {
        this.PreçoDeCompra = PreçoDeCompra;
    }

    public Date getDatadaCompra() {
        return DatadaCompra;
    }

    public void setDatadaCompra(Date DatadaCompra) {
        this.DatadaCompra = DatadaCompra;
    }

    public Date getDatadaGravacao() {
        return DatadaGravacao;
    }

    public void setDatadaGravacao(Date DatadaGravacao) {
        this.DatadaGravacao = DatadaGravacao;
    }

    public int getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(int idLabel) {
        this.idLabel = idLabel;
    }

    @Override
    public String toString() {
        return Descricao;
    }

}