/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

public class Label {
    private int idLabel;
    private String Nome;
    private String Endereco;
    private String HomePage;

    public Label() {
    }

    public Label(int idLabel, String Nome, String Endereco, String HomePage) {
        this.idLabel = idLabel;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.HomePage = HomePage;
    }

    public Label(String Nome, String Endereco, String HomePage) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.HomePage = HomePage;
    }

    public int getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(int idLabel) {
        this.idLabel = idLabel;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String HomePage) {
        this.HomePage = HomePage;
    }

    @Override
    public String toString() {
        return Nome;
    }

    
}
