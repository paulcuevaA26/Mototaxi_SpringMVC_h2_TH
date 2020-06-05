package pe.isil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.isil.model.Moto;
import pe.isil.repository.BaseRepository;
import pe.isil.repository.JdbcMotoRepository;

import java.util.List;

@Service
public class motoService implements BaseRepository<Moto,Long> {

    @Autowired
    JdbcMotoRepository jdbcMotoRepository;

    public motoService(JdbcMotoRepository jdbcMotoRepository){
        this.jdbcMotoRepository = jdbcMotoRepository;
    }

    @Override
    public void create(Moto moto) {
    jdbcMotoRepository.create(moto);
    }

    @Override
    public void update(Moto moto) {
    jdbcMotoRepository.update(moto);
    }

    @Override
    public void delete(Moto moto) {
    jdbcMotoRepository.delete(moto);
    }

    @Override
    public List<Moto> findAll() {
        return jdbcMotoRepository.findAll();
    }

    @Override
    public Moto findById(Long Numero) {
        return jdbcMotoRepository.findById(Numero);
    }
}
