import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private final String user = "rm563838";
    private final String password = "200806";

    public Connection conectar() {
        try {
            return DriverManager.getConnection(url, user, password);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}