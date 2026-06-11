package banco;

import java.util.ArrayList;
import modelo.Produto;

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
}
