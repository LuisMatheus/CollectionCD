/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Beans.Compositor;
import Beans.faixas_compositores;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Conexao;

/**
 *
 * @author luis
 */
public class CompositorDao {

    private Connection con = null;
    private PreparedStatement stmt = null;

    public ArrayList<Compositor> Listar() {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("SELECT * FROM compositores");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Compositor> temp = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("idCompositores");
                String nome = rs.getString("Nome");
                Date nasc = rs.getDate("DatadeNascimento");
                Date mort = rs.getDate("DatadaMorte");
                String local = rs.getString("LocaldeNascimento");
                int idp = rs.getInt("idPeriodo");
                temp.add(new Compositor(id, nome, nasc, mort, local, idp));
            }
            return temp;

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
        return null;
    }

    public void add(faixas_compositores fc1) {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("INSERT INTO faixas_compositores VALUES (?,?) ");

            stmt.setInt(1, fc1.getIdFaixas());
            stmt.setInt(2, fc1.getIdCompositores());
            
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
