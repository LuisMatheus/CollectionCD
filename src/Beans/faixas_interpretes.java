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
public class faixas_interpretes {
    private int idFaixas;
    private int idIntepretes;

    public faixas_interpretes() {
    }

    public faixas_interpretes(int idFaixas, int idIntepretes) {
        this.idFaixas = idFaixas;
        this.idIntepretes = idIntepretes;
    }

    public int getIdIntepretes() {
        return idIntepretes;
    }

    public void setIdIntepretes(int idIntepretes) {
        this.idIntepretes = idIntepretes;
    }

    public int getIdFaixas() {
        return idFaixas;
    }

    public void setIdFaixas(int idFaixas) {
        this.idFaixas = idFaixas;
    }
    
}
