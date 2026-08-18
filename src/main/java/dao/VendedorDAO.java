package dao;

import model.Vendedor;

import java.util.List;

public class VendedorDAO implements GenericDAO<Vendedor, Integer> {
    @Override
    public void inserir(Vendedor entidade) {
        String sql = "insert into java_vendedor(nome) values(?)";

        try(Connection connection = ConnectionFactory.obterConexao();
            PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1, entidade.getNome());
            ps.execute();

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    @Override
    public List<Vendedor> listar() {
        return null;
    }
}