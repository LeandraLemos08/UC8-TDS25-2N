/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRACRUZDELEMOS
 */
public class Mesa {

    private int numero;
    private String status;

    public Mesa(int numero, String status) {
        this.numero = numero;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Mesa " + numero + " | " + status;
    }
}
