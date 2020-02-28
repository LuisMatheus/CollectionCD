/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Beans.Composicao;
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
public class ComposicaoDao {

    private Connection con = null;
    private PreparedStatement stmt = null;

    public ArrayList<Composicao> Listar() {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("SELECT * FROM composição");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Composicao> temp = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("idComposição");
                String desc = rs.getString("Descricao");
                temp.add(new Composicao(id, desc));
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

}
