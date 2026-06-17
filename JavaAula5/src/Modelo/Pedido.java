package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRACRUZDELEMOS
 */

public class Pedido {

    private int id;
    private String cliente;
    private String produto;
    private int mesa;

    public Pedido(int id, String cliente, String produto, int mesa) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Pedido " + id + " | Cliente: " + cliente + " | Produto: " + produto + " | Mesa: " + mesa;
    }
}
