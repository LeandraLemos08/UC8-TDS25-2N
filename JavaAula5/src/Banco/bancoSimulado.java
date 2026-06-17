package Banco;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEANDRACRUZDELEMOS
 */
import Modelo.Produto;
import Modelo.Cliente;
import java.util.ArrayList;

public class bancoSimulado {
   
    public static ArrayList<Produto> produtos = new ArrayList();
   
   public static int idProduto = 1;
   
   static {
   
       produtos.add(new Produto(
   idProduto++,
   "Minério de cobre",
    2.20,
    330
   )
   );
       
       produtos.add(new Produto(
   idProduto++,
   "Minério de ferro",
    4.90,
    89
   )
   );
       
       produtos.add(new Produto(
   idProduto++,
   "Minério de carvão",
    3.50,
    66
   )
   );
       
       produtos.add(new Produto(
   idProduto++,
   "Minério de ouro",
    6.70,
    49
   )
   );
       
       produtos.add(new Produto(
   idProduto++,
   "Minério de diamante",
    8.30,
    33
   )
   );
       
       produtos.add(new Produto(
   idProduto++,
   "Minério de esmeralda",
    5.80,
    10
   )
   );
   }
   
   public static ArrayList<Cliente> clientes = new ArrayList();
    
    public static int idCliente = 1;
    static {
      clientes.add(new Cliente(
      idCliente++,
      "Marina Subway",
      "066.777.222.09",
      "submari@gmail.com"
       
       ));
      
      clientes.add(new Cliente(
      idCliente++,
      "Louise Dupont",
      "321.555.333.08",
      "dupontloui@gmail.com"
       
       ));
      
       clientes.add(new Cliente(
      idCliente++,
      "Sebastian Thorn",
      "567.888.123.55",
      "thornsebstian@gmail.com"
       
       ));
       
        clientes.add(new Cliente(
      idCliente++,
      "Julius Lahiffe",
      "218.749.846.16",
      "juhiffe@gmail.com"
       
        ));
       
         clientes.add(new Cliente(
      idCliente++,
      "Hugo Minnnt",
      "987.203.729.84",
      "miiiiinnnnt@gmail.com"
       
         ));
    };
}
