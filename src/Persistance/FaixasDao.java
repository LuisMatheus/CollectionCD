/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Beans.CD;
import Beans.Faixas;
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
public class FaixasDao {

    private Connection con = null;
    private PreparedStatement st = null;

    public ArrayList<Faixas> buscar(CD c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void inserir(Faixas faixas) {
        try {
            con = Conexao.getConexao();

            st = con.prepareStatement("INSERT INTO faixas (NumerodaFaixa , Descricao , CD_idCD , Composição_idComposição , TipodeGravação_idTipodeGravação) VALUES (?,?,?,?,?)");

            st.setInt(1, faixas.getNumerodaFaixa());
            st.setString(2, faixas.getDescricao());
            st.setInt(3, faixas.getIdCD());
            st.setInt(4, faixas.getIdComposicao());
            st.setInt(5, faixas.getIdTipodeGravacao());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(FaixasDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int maxid() {
        try {
            con = Conexao.getConexao();

            st = con.prepareStatement("SELECT MAX(idFaixas) as 'faixaid' FROM faixas");

            ResultSet rs = st.executeQuery();
            
            if(rs.next()){
                return rs.getInt("faixaid");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(FaixasDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

}
