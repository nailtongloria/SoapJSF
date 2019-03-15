/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import webservice.AtendePessoaEJB;
import webservice.AtendePessoas;
import webservice.Pessoa;


/**
 *
 * @author nailton viana gloria
 */
public class RetornaListaPessoa {
    
   
   
    public static void main(String [] args){
        
        AtendePessoas service = new AtendePessoas();
        AtendePessoaEJB port = service.getAtendePessoaEJBPort();
       for(Pessoa p:   port.listarTodos()){
           
            System.out.println("nome  "+p.getNome() +"data de nascimento  " +p.getData()+"idade :"+p.getIdade()+"sexo  "+p.getSexo()+"ocupacao  "+p.getOcupacao());
       }

    }
    
}
