package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Veiculo;
import com.classes.Conexao.Conexao;
	
public class VeiculoDAO {
	

	

	

	    final String NOMEDATABELA = "Veiculo";
	    
	    public boolean inserir(Veiculo veiculo) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (modelo, taxa, locacoes, ativo) VALUES (?,?,?,?)";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, veiculo.getModelo());
	            ps.setFloat(2, veiculo.getTaxa());
	            ps.setInt(3, veiculo.getLocacoes());
	            ps.setString(4, veiculo.getAtivo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	            } 
	        	catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean alterar(Veiculo veiculo) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET modelo = ?, taxa = ?, locacoes = ?, ativo = ? WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, veiculo.getModelo());
	            ps.setFloat(2, veiculo.getTaxa());
	            ps.setInt(3, veiculo.getLocacoes());
	            ps.setString(4, veiculo.getAtivo());
	            ps.setInt(5, veiculo.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	            }catch (Exception e) {
	        	e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean excluir(Veiculo veiculo) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, veiculo.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public Veiculo procurarPorCodigo(Veiculo veiculo) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, veiculo.getCodigo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Veiculo obj = new Veiculo();
	                obj.setCodigo(rs.getInt(1));
	                obj.setModelo(rs.getString(2));
	                obj.setTaxa(rs.getFloat(3));
	                obj.setLocacoes(rs.getInt(4));
	                obj.setAtivo(rs.getString(5));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                System.out.println("Codigo nao encontrado");
	                return null;
	            }
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return null;
	        }
	    }
	    public Veiculo procurarPorModelo(Veiculo veiculo) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE modelo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, veiculo.getModelo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Veiculo obj = new Veiculo();
	                obj.setCodigo(rs.getInt(1));
	                obj.setModelo(rs.getString(2));
	                obj.setTaxa(rs.getFloat(3));
	                obj.setLocacoes(rs.getInt(4));
	                obj.setAtivo(rs.getString(5));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                System.out.println("Modelo nao encontrado");
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
	    public boolean existeModelo(Veiculo veiculo) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE modelo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, veiculo.getModelo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                ps.close();
	                rs.close();
	                conn.close();
	                return true;
	            }
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return false;
	        }
	        return false;
	    }
	    
	    public List<Veiculo> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Veiculo> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return null;
	        }
	    }
	    public List<Veiculo> montarLista(ResultSet rs) {
	        List<Veiculo> listObj = new ArrayList<Veiculo>();
	        try {
	            while (rs.next()) {
	            	Veiculo obj = new Veiculo();
	            	obj.setCodigo(rs.getInt(1));
	                obj.setModelo(rs.getString(2));
	                obj.setTaxa(rs.getFloat(3));
	                obj.setLocacoes(rs.getInt(4));
	                obj.setAtivo(rs.getString(5));
	                listObj.add(obj);
	            }
	            return listObj;
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return null;
	        }
	    }
	
}