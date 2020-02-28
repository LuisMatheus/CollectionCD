/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Beans.Composicao;
import Beans.Gravacao;
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
public class GravacaoDao {

    private Connection con = null;
    private PreparedStatement stmt = null;

    public ArrayList<Gravacao> Listar() {
        try {
            con = Conexao.getConexao();
            stmt = con.prepareStatement("SELECT * from tipodegravação");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Gravacao> temp = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("idtipodegravação");
                String desc = rs.getString("TipodeGravação");
                temp.add(new Gravacao(id, desc));
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
