package lab5.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab5.entity.Specialty;
import lab5.repository.SpecialtyRepository;
import lab5.service.SpecialtyService;

@Service
public class SpecialtyServiceImpl implements SpecialtyService {

    @Autowired
    private SpecialtyRepository repository;

    @Override
    public Specialty read(Long id) {
        return repository.findOne(id);
    }

    @Override
    public List<Specialty> read() {
        return repository.findAll();
    }

    @Override
    public void save(Specialty entity) {
        repository.save(entity);

    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public Specialty readByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Specialty readBycod_spec(String cod_spec) {
        return repository.findBycod_spec(cod_spec);
    }

}