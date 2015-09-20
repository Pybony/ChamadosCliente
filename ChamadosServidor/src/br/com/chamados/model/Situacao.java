package br.com.chamados.model;
// Generated 20/09/2015 15:42:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Situacao generated by hbm2java
 */
public class Situacao  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Set chamados = new HashSet(0);

    public Situacao() {
    }

	
    public Situacao(int id) {
        this.id = id;
    }
    public Situacao(int id, String descricao, Set chamados) {
       this.id = id;
       this.descricao = descricao;
       this.chamados = chamados;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Set getChamados() {
        return this.chamados;
    }
    
    public void setChamados(Set chamados) {
        this.chamados = chamados;
    }




}


