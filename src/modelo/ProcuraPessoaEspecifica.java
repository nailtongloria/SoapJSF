/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import webservice.AtendePessoaEJB;
import webservice.AtendePessoas;
import webservice.Pessoa;

/**
 *
 * @author nailton viana gloria
 */
public class ProcuraPessoaEspecifica {
    
    public static void main(String[ ] args){
            
        AtendePessoas service = new AtendePessoas();
        AtendePessoaEJB port = service.getAtendePessoaEJBPort();
       for(Pessoa p:   port.pesquisaPorNome("carmine")){
            System.out.println("Nome  "+p.getNome() +" Data de nascimento  " +p.getData()+" Idade :"+p.getIdade()+" sexo  "+p.getSexo()+" ocupacao  "+p.getOcupacao()+" Logradouro "+p.getLogradouro().getLogradouro()+" Bairro "+p.getLogradouro().getBairro()+" Cidade  "+p.getCidade().getNome()+" Estado  "+p.getCidade().getEstado().getNome());
       }

    }
    
    
}
