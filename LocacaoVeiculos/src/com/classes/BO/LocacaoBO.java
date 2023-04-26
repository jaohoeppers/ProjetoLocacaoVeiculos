package com.classes.BO;

import com.classes.DTO.Locacao;
import com.classes.DAO.LocacaoDAO;
import java.util.List;

public class LocacaoBO {

    public boolean inserir(Locacao marca){
        
        	LocacaoDAO marcasDAO = new LocacaoDAO();
            return marcasDAO.inserir(marca);
       
    }
    public boolean alterar(Locacao marca){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.alterar(marca);
    }
    public boolean excluir(Locacao marca){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.excluir(marca);
    }
    public Locacao procurarPorCodigo(Locacao marca){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.procurarPorCodigo(marca);
    }
    public Locacao procurarPorCliente(Locacao marca){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.procurarPorCliente(marca);
    }
    public Locacao procurarPorVeiculo(Locacao marca){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.procurarPorVeiculo(marca);
    }
    public boolean existeLocacaoCliente(Locacao marca){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.existeLocacaoCliente(marca);
    }
    public boolean existeLocacaoVeiculo(Locacao marca){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.existeLocacaoVeiculo(marca);
    }
    public List<Locacao> pesquisarTodos(){
    	LocacaoDAO marcasDAO = new LocacaoDAO();
        return marcasDAO.pesquisarTodos();
    }
}