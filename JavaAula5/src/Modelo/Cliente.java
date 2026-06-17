package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRACRUZDELEMOS
 */

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    
    public Cliente(){
    }

    public Cliente(int id, String nome, String cpf, String email){
    this.id = id; 
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    }   
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
