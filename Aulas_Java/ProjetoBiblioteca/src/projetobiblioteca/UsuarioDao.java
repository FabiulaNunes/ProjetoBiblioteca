package projetobiblioteca;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class UsuarioDao {

    private Connection connection;

    public UsuarioDao() {
        this.connection = new ConnectionsFactory().conectaBD();
    }

    public void criaUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (nome,email,"
                + "telefone, tipo_usuario) VALUES (?,?,?,?)";

        PreparedStatement pstm = null;

        try {

            pstm = connection.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getTelefone());
            pstm.setString(4, usuario.getTipo_usuario());

            pstm.executeUpdate();
            System.out.println("Deu certo!!!");
        } catch (SQLException e) {
            System.out.println("Deu ruim" + e.getMessage());
        } finally {
            if (pstm != null) {
                pstm.close();
            }
        }
    }

}
