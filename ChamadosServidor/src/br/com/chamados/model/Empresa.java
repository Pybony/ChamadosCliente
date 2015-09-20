package br.com.chamados.model;
// Generated 20/09/2015 15:42:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private int id;
     private Bairro bairro;
     private Cidade cidade;
     private String nome;
     private String cgc;
     private String endereco;
     private String telefone;
     private String email;
     private Set funcionarios = new HashSet(0);
     private Set chamados = new HashSet(0);
     private Set pessoas = new HashSet(0);

    public Empresa() {
    }

	
    public Empresa(int id, Bairro bairro, Cidade cidade, String nome, String cgc, String endereco, String telefone, String email) {
        this.id = id;
        this.bairro = bairro;
        this.cidade = cidade;
        this.nome = nome;
        this.cgc = cgc;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    public Empresa(int id, Bairro bairro, Cidade cidade, String nome, String cgc, String endereco, String telefone, String email, Set funcionarios, Set chamados, Set pessoas) {
       this.id = id;
       this.bairro = bairro;
       this.cidade = cidade;
       this.nome = nome;
       this.cgc = cgc;
       this.endereco = endereco;
       this.telefone = telefone;
       this.email = email;
       this.funcionarios = funcionarios;
       this.chamados = chamados;
       this.pessoas = pessoas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Bairro getBairro() {
        return this.bairro;
    }
    
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCgc() {
        return this.cgc;
    }
    
    public void setCgc(String cgc) {
        this.cgc = cgc;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Set getChamados() {
        return this.chamados;
    }
    
    public void setChamados(Set chamados) {
        this.chamados = chamados;
    }
    public Set getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Set pessoas) {
        this.pessoas = pessoas;
    }




}


