package banco;

import java.util.ArrayList;
import modelo.Cliente;


public class bancoSimulado {
    public static ArrayList<Cliente> clientes = new ArrayList();
    
    public static int idCliente = 1;
    static {
      clientes.add(new Cliente(
      idCliente++,
      "Anna Azevedo",
      "099.888.444.66",
      "azevedoann@gmail.com"
    
       ));
      
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
   
    };
}
