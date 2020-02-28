/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Beans.CD;
import Beans.Gravacao;
import Beans.Label;
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
public class LabelDao {

    private Connection con = null;
    private PreparedStatement stmt = null;

    public ArrayList<Label> Listar() {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("SELECT * from label");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Label> temp = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("idLabel");
                String Nome = rs.getString("Nome");
                String end = rs.getString("Endereço");
                String home = rs.getString("HomePage");
                temp.add(new Label(id, Nome, end, home));
            }
            return temp;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ComposicaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public Label buscar(CD c) {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("SELECT * FROM label WHERE idLabel = ? ");

            stmt.setInt(1, c.getIdLabel());
                        
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                String nome = rs.getString("Nome");
                String end = rs.getString("Endereço");
                String home = rs.getString("HomePage");
                return new Label(c.getIdLabel(), nome, end, home);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ComposicaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}

