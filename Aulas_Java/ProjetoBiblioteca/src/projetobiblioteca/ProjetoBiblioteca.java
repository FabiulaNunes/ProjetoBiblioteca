package projetobiblioteca;

import java.sql.SQLException;

public class ProjetoBiblioteca {

    public static void main(String[] args) throws SQLException {

//        UsuarioDao usuarioDao = new UsuarioDao(0,"Jubileu","jubileu.com","61-989898","Mentirinha");
//       
//        usuarioDao.criaUsuario(usuario);;
        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuario = new Usuario(0, "Jubileu", "jubileu.com", "61-989898", "Mentirinha");

        try{
            usuarioDao.criaUsuario(usuario);
        }catch (SQLException e){
            System.out.println("Deu errado"+e.getMessage());
        }

    }

}
