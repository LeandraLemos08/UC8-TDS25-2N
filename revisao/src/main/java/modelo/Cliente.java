
package modelo;


public class Cliente {
    private int id;
    private String nome;
    private String CPF;
    private String fone;
    private String email;
    
    public Cliente(){
    
    }
    
    public Cliente(int id, String nome, String CPF, String fone, String email){
    this.id = id;
    this.nome = nome;
    this.CPF = CPF;
    this.fone = fone;
    this.email = email;
    
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setFone(String fone) {
        this.fone = fone;
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

    public String getCPF() {
        return CPF;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }
}
