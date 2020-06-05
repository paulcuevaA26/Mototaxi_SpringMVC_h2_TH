package pe.isil.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.isil.model.Moto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class JdbcMotoRepository implements MotoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Moto moto) {
        final String SQL = "INSERT INTO moto(placa, modelo, color,estadoOpe) values (?,?,?,?)";
        jdbcTemplate.update(SQL,moto.getPlaca(),
                                moto.getModelo(),
                                moto.getColor(),
                                moto.getEstadoOpe());
    }

    @Override
    public void update(Moto moto) {
        final String SQL = "Update moto set placa=?, modelo=?, color=?,estadoOpe=? where numero = ?";
        jdbcTemplate.update(SQL,moto.getPlaca(),
                                moto.getModelo(),
                                moto.getColor(),
                                moto.getEstadoOpe(),
                                moto.getNumero());
    }

    @Override
    public void delete(Moto moto) {
    final String SQL = "DELETE moto where numero = ?";
    jdbcTemplate.update(SQL,moto.getNumero());
    }

    @Override
    public List<Moto> findAll() {
       final String SQL = "SELECT * FROM moto";
       List<Moto> motos = jdbcTemplate.query(SQL, JdbcMotoRepository::MotoRowMapper);
       return motos;
    }

    @Override
    public Moto findById(Long numero) {
        final String SQL = "Select * from moto where numero=?";
        Moto moto = jdbcTemplate.queryForObject(SQL, new Object[]{numero}, JdbcMotoRepository::MotoRowMapper);
        return moto;
    }

    private static Moto MotoRowMapper(ResultSet resultSet, int i) throws SQLException{
        Long numero = resultSet.getLong("numero");
        String placa = resultSet.getString("placa");
        String modelo = resultSet.getString("modelo");
        String color = resultSet.getString("color");
        String estadoOpe = resultSet.getString("estadoOpe");
        return new Moto(numero,placa,modelo,color,estadoOpe);
    }


}
