package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Faturamento;
import com.classes.Conexao.Conexao;
	
public class FaturamentoDAO {
	

	

	

	    final String NOMEDATABELA = "Faturamento";
	    
	    public boolean inserir(Faturamento faturamento) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (valor,inicio,fim) VALUES (?,?,?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setDouble(1, faturamento.getValor());
	            ps.setDate(2, faturamento.getInicio());
	            ps.setDate(3, faturamento.getFim());
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
	    public boolean alterar(Faturamento faturamento) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET valor = ?, inicio = ?, fim = ? WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setDouble(1, faturamento.getValor());
	            ps.setDate(2, faturamento.getInicio());
	            ps.setDate(3, faturamento.getFim());
	            ps.setInt(4, faturamento.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	            }catch (Exception e) {
	        	e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean excluir(Faturamento faturamento) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, faturamento.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public Faturamento procurarPorCodigo(Faturamento faturamento) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, faturamento.getCodigo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Faturamento obj = new Faturamento();
	                obj.setCodigo(rs.getInt(1));
	                obj.setValor(rs.getDouble(2));
	                obj.setInicio(rs.getDate(3));
	                obj.setFim(rs.getDate(4));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return null;
	        }
	    }
	    public Faturamento procurarPorValor(Faturamento faturamento) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE valor = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setDouble(1, faturamento.getValor());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Faturamento obj = new Faturamento();
	            	obj.setCodigo(rs.getInt(1));
	                obj.setValor(rs.getDouble(2));
	                obj.setInicio(rs.getDate(3));
	                obj.setFim(rs.getDate(4));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    public Faturamento procurarPorInicio(Faturamento faturamento) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE inicio = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setDate(1, faturamento.getInicio());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Faturamento obj = new Faturamento();
	            	obj.setCodigo(rs.getInt(1));
	                obj.setValor(rs.getDouble(2));
	                obj.setInicio(rs.getDate(3));
	                obj.setFim(rs.getDate(4));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    public Faturamento procurarPorFim(Faturamento faturamento) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE fim = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setDate(1, faturamento.getFim());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Faturamento obj = new Faturamento();
	            	obj.setCodigo(rs.getInt(1));
	                obj.setValor(rs.getDouble(2));
	                obj.setInicio(rs.getDate(3));
	                obj.setFim(rs.getDate(4));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    public List<Faturamento> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Faturamento> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return null;
	        }
	    }
	    public List<Faturamento> montarLista(ResultSet rs) {
	        List<Faturamento> listObj = new ArrayList<Faturamento>();
	        try {
	            while (rs.next()) {
	            	Faturamento obj = new Faturamento();
	                obj.setCodigo(rs.getInt(1));
	                obj.setValor(rs.getDouble(2));
	                obj.setInicio(rs.getDate(3));
	                obj.setFim(rs.getDate(4));
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