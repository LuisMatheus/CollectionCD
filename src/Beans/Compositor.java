/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.sql.Date;

public class Compositor {
    private int idCompositor;
    private String Nome;
    private Date DatadeNascimento;
    private Date DatadaMorte;
    private String LocaldeNascimento;
    private int idPeriodo;

    public Compositor(String Nome, Date DatadeNascimento, Date DatadaMorte, String LocaldeNascimento, int idPeriodo) {
        this.Nome = Nome;
        this.DatadeNascimento = DatadeNascimento;
        this.DatadaMorte = DatadaMorte;
        this.LocaldeNascimento = LocaldeNascimento;
        this.idPeriodo = idPeriodo;
    }

    public Compositor(int idCompositor, String Nome, Date DatadeNascimento, Date DatadaMorte, String LocaldeNascimento) {
        this.idCompositor = idCompositor;
        this.Nome = Nome;
        this.DatadeNascimento = DatadeNascimento;
        this.DatadaMorte = DatadaMorte;
        this.LocaldeNascimento = LocaldeNascimento;
    }

    public Compositor(String Nome, Date DatadeNascimento, Date DatadaMorte, String LocaldeNascimento) {
        this.Nome = Nome;
        this.DatadeNascimento = DatadeNascimento;
        this.DatadaMorte = DatadaMorte;
        this.LocaldeNascimento = LocaldeNascimento;
    }

    public Compositor() {
    }

    public Compositor(int idCompositor, String Nome, Date DatadeNascimento, Date DatadaMorte, String LocaldeNascimento, int idPeriodo) {
        this.idCompositor = idCompositor;
        this.Nome = Nome;
        this.DatadeNascimento = DatadeNascimento;
        this.DatadaMorte = DatadaMorte;
        this.LocaldeNascimento = LocaldeNascimento;
        this.idPeriodo = idPeriodo;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getIdCompositor() {
        return idCompositor;
    }

    public void setIdCompositor(int idCompositor) {
        this.idCompositor = idCompositor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(Date DatadeNascimento) {
        this.DatadeNascimento = DatadeNascimento;
    }

    public Date getDatadaMorte() {
        return DatadaMorte;
    }

    public void setDatadaMorte(Date DatadaMorte) {
        this.DatadaMorte = DatadaMorte;
    }

    public String getLocaldeNascimento() {
        return LocaldeNascimento;
    }

    public void setLocaldeNascimento(String LocaldeNascimento) {
        this.LocaldeNascimento = LocaldeNascimento;
    }

    @Override
    public String toString() {
        return Nome;
    }
    
    
}
