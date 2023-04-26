package com.classes.BO;

import com.classes.DTO.Faturamento;
import com.classes.DAO.FaturamentoDAO;
import java.util.List;

public class FaturamentoBO {

    public boolean inserir(Faturamento faturamento){
        FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.inserir(faturamento);
        
    }
    public boolean alterar(Faturamento faturamento){
    	FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.alterar(faturamento);
    }
    public boolean excluir(Faturamento faturamento){
    	FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.excluir(faturamento);
    }
    public Faturamento procurarPorCodigo(Faturamento faturamento){
    	FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.procurarPorCodigo(faturamento);
    }
    public Faturamento procurarPorInicio(Faturamento faturamento){
    	FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.procurarPorInicio(faturamento);
    }
    public Faturamento procurarPorFim(Faturamento faturamento){
    	FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.procurarPorFim(faturamento);
    }
    public Faturamento procurarPorValor(Faturamento faturamento){
    	FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.procurarPorValor(faturamento);
    }
    public List<Faturamento> pesquisarTodos(){
    	FaturamentoDAO marcasDAO = new FaturamentoDAO();
        return marcasDAO.pesquisarTodos();
    }
}