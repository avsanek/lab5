package lab5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lab5.entity.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {

    Specialty findBycod_spec(String name);

    Specialty findByName(String name);

}
