

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.DTO.Cliente;
import com.classes.DTO.Locacao;
import com.classes.DTO.Veiculo;
import com.classes.Conexao.Conexao;
	
public class LocacaoDAO {
	

	

	

	    final String NOMEDATABELA = "Locacoes";
	    
	    public boolean inserir(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (cliente) VALUES (?) (veiculo) VALUES (?) (valor) VALUES (?)(inicio) VALUES (?)(fim) VALUES (?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, (locacao.getCliente()).getNome());
	            ps.setString(2, (locacao.getVeiculo()).getModelo());
	            ps.setDouble(3, locacao.getValor());
	            ps.setDate(4, locacao.getInicio());
	            ps.setLong(5, locacao.getFim());
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
	    public boolean alterar(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET cliente = ? SET veiculo = ? SET valor = ? SET inicio = ? SET fim = ? WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, (locacao.getCliente()).getNome());
	            ps.setString(2, locacao.getVeiculo().getModelo());
	            ps.setDouble(3, locacao.getValor());
	            ps.setDate(4, locacao.getInicio());
		        ps.setDate(5, locacao.getFim());
	            ps.setInt(6, locacao.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	            }catch (Exception e) {
	        	e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean excluir(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, locacao.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    public Locacao procurarPorCodigo(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, locacao.getCodigo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Locacao obj = new Locacao();
	            	Cliente cli = new Cliente();
	            	Veiculo vei = new Veiculo();
	            	obj.setCodigo(rs.getInt(1));
	                cli.setNome(rs.getString(2));
	                obj.setCliente(cli);
	                vei.setModelo(rs.getString(3));
	                obj.setVeiculo(vei);
	                obj.setValor(rs.getDouble(4));
	                obj.setInicio(rs.getDate(5));
	                obj.setFim(rs.getDate(6));
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
	    public Locacao procurarPorCliente(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cliente = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, locacao.getCliente().getNome());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Locacao obj = new Locacao();
	            	Cliente cli = new Cliente();
	            	Veiculo vei = new Veiculo();
	            	obj.setCodigo(rs.getInt(1));
	                cli.setNome(rs.getString(2));
	                obj.setCliente(cli);
	                vei.setModelo(rs.getString(3));
	                obj.setVeiculo(vei);
	                obj.setValor(rs.getDouble(4));
	                obj.setInicio(rs.getDate(5));
	                obj.setFim(rs.getDate(6));
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
	    public Locacao procurarPorVeiculo(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE veiculo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, locacao.getVeiculo().getModelo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	Locacao obj = new Locacao();
	            	Cliente cli = new Cliente();
	            	Veiculo vei = new Veiculo();
	            	obj.setCodigo(rs.getInt(1));
	                cli.setNome(rs.getString(2));
	                obj.setCliente(cli);
	                vei.setModelo(rs.getString(3));
	                obj.setVeiculo(vei);
	                obj.setValor(rs.getDouble(4));
	                obj.setInicio(rs.getDate(5));
	                obj.setFim(rs.getDate(6));
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
	    public boolean existeLocacaoCliente(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cliente = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, locacao.getCliente().getNome());
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
	    public boolean existeLocacaoVeiculo(Locacao locacao) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE veiculo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, locacao.getVeiculo().getModelo());
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
	    public List<Locacao> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<Locacao> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            //System.err.println("Erro: " + e.toString());
	            //e.printStackTrace();
	            return null;
	        }
	    }
	    public List<Locacao> montarLista(ResultSet rs) {
	        List<Locacao> listObj = new ArrayList<Locacao>();
	        try {
	            while (rs.next()) {
	            	Locacao obj = new Locacao();
	            	Cliente cli = new Cliente();
	            	Veiculo vei = new Veiculo();
	            	obj.setCodigo(rs.getInt(1));
	                cli.setNome(rs.getString(2));
	                obj.setCliente(cli);
	                vei.setModelo(rs.getString(3));
	                obj.setVeiculo(vei);
	                obj.setValor(rs.getDouble(4));
	                obj.setInicio(rs.getDate(5));
	                obj.setFim(rs.getDate(6));
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