/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Date;

public class Periodo {
    private int idPeriodo;
    private String Descicao;
    private Date DatadeInicio;
    private Date DatadoFim;

    public Periodo(int idPeriodo, String Descicao, Date DatadeInicio, Date DatadoFim) {
        this.idPeriodo = idPeriodo;
        this.Descicao = Descicao;
        this.DatadeInicio = DatadeInicio;
        this.DatadoFim = DatadoFim;
    }

    public Periodo(String Descicao, Date DatadeInicio, Date DatadoFim) {
        this.Descicao = Descicao;
        this.DatadeInicio = DatadeInicio;
        this.DatadoFim = DatadoFim;
    }

    public Periodo() {
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getDescicao() {
        return Descicao;
    }

    public void setDescicao(String Descicao) {
        this.Descicao = Descicao;
    }

    public Date getDatadeInicio() {
        return DatadeInicio;
    }

    public void setDatadeInicio(Date DatadeInicio) {
        this.DatadeInicio = DatadeInicio;
    }

    public Date getDatadoFim() {
        return DatadoFim;
    }

    public void setDatadoFim(Date DatadoFim) {
        this.DatadoFim = DatadoFim;
    }

    @Override
    public String toString() {
        return Descicao;
    }
     
    
}
