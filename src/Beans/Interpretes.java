/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

public class Interpretes {
    private int idInterpretes;
    private String Nome;
    private String Tipo;

    public Interpretes(int idInterpretes, String Nome, String Tipo) {
        this.idInterpretes = idInterpretes;
        this.Nome = Nome;
        this.Tipo = Tipo;
    }

    public Interpretes(String Nome, String Tipo) {
        this.Nome = Nome;
        this.Tipo = Tipo;
    }

    public int getIdInterpretes() {
        return idInterpretes;
    }

    public void setIdInterpretes(int idInterpretes) {
        this.idInterpretes = idInterpretes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return Nome;
    }
}
