package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Cliente;
import com.classes.Conexao.Conexao;
	
public class ClienteDAO {
	

	

	

	    final String NOMEDATABELA = "Cliente";
	    
	    public boolean inserir(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (nome,email,ativo) VALUES (?,?,?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getNome());
	            ps.setString(2, cliente.getEmail());
	            ps.setString(3, cliente.getAtivo());
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
	    public boolean alterar(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, email = ?, ativo = ? WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getNome());
	            ps.setString(2, cliente.getEmail());
	            ps.setString(3, cliente.getAtivo());
	            ps.setInt(4, cliente.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	            }catch (Exception e) {
	        	e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean excluir(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, cliente.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public Cliente procurarPorCodigo(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, cliente.getCodigo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Cliente obj = new Cliente();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setEmail(rs.getString(3));
	                obj.setAtivo(rs.getString(4));
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
	    public Cliente procurarPorNome(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getNome());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Cliente obj = new Cliente();
	            	obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setEmail(rs.getString(3));
	                obj.setAtivo(rs.getString(4));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                System.out.println("Nome nao encontrado");
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    public Cliente procurarPorEmail(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE email = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getEmail());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Cliente obj = new Cliente();
	            	obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setEmail(rs.getString(3));
	                obj.setAtivo(rs.getString(4));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                System.out.println("Email nao encontrado");
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    public boolean existeNome(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getNome());
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
	    public boolean existeEmail(Cliente cliente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE email = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, cliente.getEmail());
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
	    public List<Cliente> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Cliente> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return null;
	        }
	    }
	    public List<Cliente> montarLista(ResultSet rs) {
	        List<Cliente> listObj = new ArrayList<Cliente>();
	        try {
	            while (rs.next()) {
	            	Cliente obj = new Cliente();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setEmail(rs.getString(3));
	                obj.setAtivo(rs.getString(4));
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
