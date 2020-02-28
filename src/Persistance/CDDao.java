/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Beans.CD;
import java.sql.Connection;
import java.sql.Date;
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
public class CDDao {

    private Connection con = null;
    private PreparedStatement st = null;

    public ArrayList<CD> buscar(String text) {
        try {
            con = Conexao.getConexao();

            st = con.prepareStatement("SELECT * FROM cd WHERE Descricao LIKE ?");

            st.setString(1, "%"+text+"%");
            
            ResultSet rs = st.executeQuery();
            
            ArrayList<CD> temp = new ArrayList<>();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String desc = rs.getString(2);
                double pc = rs.getDouble(3);
                Date compra = rs.getDate(4);
                Date gravacao = rs.getDate(5);
                int label = rs.getInt(6);
                
                temp.add(new CD(id, desc, pc, compra, gravacao, label));
            }
            
            return temp;
                    
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(CDDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public CD procurar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean excluir(CD cd) {
        //! excluir as faixas tambem
        try {
            con = Conexao.getConexao();

            st = con.prepareStatement("DELETE FROM cd WHERE idCD=?");

            st.setInt(1, cd.getIdCD());

            st.executeUpdate();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(CDDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public void inserir(CD c) {
        try {
            con = Conexao.getConexao();

            st = con.prepareStatement("INSERT INTO cd (Descricao,PreçodeCompra,DatadaCompra,DatadaGravacao,Label_idLabel) VALUES(?,?,?,?,?)");

            st.setString(1, c.getDescricao());
            st.setDouble(2, c.getPreçoDeCompra());
            st.setDate(3, c.getDatadaCompra());
            st.setDate(4, c.getDatadaGravacao());
            st.setInt(5, c.getIdLabel());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(CDDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int maxid() {
        try {
            con = Conexao.getConexao();

            st = con.prepareStatement("SELECT MAX(idCD) as 'cd' FROM cd");

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                return rs.getInt("cd");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(CDDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public boolean alterar(CD cd) {
        try {
            con = Conexao.getConexao();

            st = con.prepareStatement("UPDATE cd SET `Descricao` = ? , `PreçodeCompra` = ? , `DatadaCompra` = ? ,`DatadaGravacao` = ? , `Label_idLabel` = ? WHERE `idCD` = ?");

            st.setString(1, cd.getDescricao());
            st.setDouble(2, cd.getPreçoDeCompra());
            st.setDate(3, cd.getDatadaCompra());
            st.setDate(4, cd.getDatadaGravacao());
            st.setInt(5, cd.getIdLabel());
            st.setInt(6, cd.getIdCD());

            st.executeUpdate();
            
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(CDDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

}
