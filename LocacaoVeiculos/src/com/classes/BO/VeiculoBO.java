package com.classes.BO;

import com.classes.DTO.Veiculo;
import com.classes.DAO.VeiculoDAO;
import java.util.List;
import java.util.Scanner;

public class VeiculoBO {

    public boolean inserir(Veiculo marca){
        if (existeModelo(marca) != true) {
        	VeiculoDAO marcasDAO = new VeiculoDAO();
            return marcasDAO.inserir(marca);
        }
        System.out.println("Já existe um veiculo deste mesmo modelo, deseja adicionar mais um?");
        System.out.println("digite s para sim e n para nao");
        Scanner ent=new Scanner(System.in);
        String nsei = ent.nextLine();
        if((nsei.equalsIgnoreCase("s"))==true) {
        	VeiculoDAO marcasDAO = new VeiculoDAO();
            return marcasDAO.inserir(marca);
        }
        return false;
    }
    public boolean alterar(Veiculo marca){
    	VeiculoDAO marcasDAO = new VeiculoDAO();
        return marcasDAO.alterar(marca);
    }
    public boolean excluir(Veiculo marca){
    	VeiculoDAO marcasDAO = new VeiculoDAO();
        return marcasDAO.excluir(marca);
    }
    public Veiculo procurarPorCodigo(Veiculo marca){
    	VeiculoDAO marcasDAO = new VeiculoDAO();
        return marcasDAO.procurarPorCodigo(marca);
    }
    public Veiculo procurarPorModelo(Veiculo marca){
    	VeiculoDAO marcasDAO = new VeiculoDAO();
        return marcasDAO.procurarPorModelo(marca);
    }
    public boolean existeModelo(Veiculo marca){
    	VeiculoDAO marcasDAO = new VeiculoDAO();
        return marcasDAO.existeModelo(marca);
    }
    public List<Veiculo> pesquisarTodos(){
    	VeiculoDAO marcasDAO = new VeiculoDAO();
        return marcasDAO.pesquisarTodos();
    }
}