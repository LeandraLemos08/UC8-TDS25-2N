package Banco;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Modelo.Usuario;
import java.util.ArrayList;
/**
 *
 * @author LEANDRACRUZDELEMOS
 */
 public class BancoUsuario {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static void adicionarUsuario(Usuario usuario){
    usuarios.add(usuario);
    }


  public static boolean ValidarLogin(String email, String senha){
    for (Usuario u : usuarios) {
    if(u.getEmail().equals(email) && u.getSenha().equals(senha)){
        return true;
    }
    }
    return false;
    }
    
    public static String ValidarNome(String email, String senha){
        for (Usuario u : usuarios){
            if (u.getEmail().equals(email) && u.getSenha().equals(senha)){
                return u.getNome();
            }
        }
        return "Sem nome";
    }
 }