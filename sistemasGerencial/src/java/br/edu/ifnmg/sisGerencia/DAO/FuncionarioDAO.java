/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sisGerencia.DAO;

import br.edu.ifnmg.ArqSoft.Connection.ConnectionFactory;
import br.edu.ifnmg.sisGerencia.DomainModel.Funcionario;
import br.edu.ifnmg.sisGerencia.DomainModel.RepositorioFuncionario;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joice
 */
public class FuncionarioDAO extends RepositorioFuncionario{


    public boolean Salvar(Funcionario funcionario){
        try {
            Connection conexao = ConnectionFactory.getConexao();
            PreparedStatement ps = conexao.prepareCall("INSERT INTO `funcionario` (`nome`) VALUES (?)");
            ps.setString(1, funcionario.getNome());
            ps.execute();
            ConnectionFactory.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean Apagar(Funcionario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Funcionario Abrir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public List<Funcionario> Buscar(Funcionario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
