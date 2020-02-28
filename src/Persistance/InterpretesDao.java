/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Beans.Interpretes;
import Beans.faixas_interpretes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Conexao;

/**
 *
 * @author luis
 */
public class InterpretesDao {

    private Connection con = null;
    private PreparedStatement stmt = null;

    public ArrayList<Interpretes> Listar() {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("SELECT * FROM interpretes");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Interpretes> temp = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("idInterpretes");
                String nome = rs.getString("Nome");
                String Tipo = rs.getString("Tipo");
                temp.add(new Interpretes(id, nome, Tipo));
            }
            return temp;

        } catch (SQLException e) {

        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CompositorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public void add(faixas_interpretes fi1) {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("INSERT INTO faixas_interpretes VALUES (?,?) ");

            stmt.setInt(1, fi1.getIdFaixas());
            stmt.setInt(2, fi1.getIdIntepretes());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CompositorDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
