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
public class faixas_compositores {
    private int idFaixas;
    private int idCompositores;

    public int getIdFaixas() {
        return idFaixas;
    }

    public void setIdFaixas(int idFaixas) {
        this.idFaixas = idFaixas;
    }

    public int getIdCompositores() {
        return idCompositores;
    }

    public void setIdCompositores(int idCompositores) {
        this.idCompositores = idCompositores;
    }

    public faixas_compositores(int idFaixas, int idCompositores) {
        this.idFaixas = idFaixas;
        this.idCompositores = idCompositores;
    }

    public faixas_compositores() {
    }
}
