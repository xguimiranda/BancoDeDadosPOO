import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDAO {
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;

    public CategoriaDAO() {
        this.connection = new Conexao().conectar();
    }

    public void inserir(Categoria categoria) {
        sql = "insert into java_categoria(categoria) values (?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, categoria.getCategoria());
            ps.execute();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}