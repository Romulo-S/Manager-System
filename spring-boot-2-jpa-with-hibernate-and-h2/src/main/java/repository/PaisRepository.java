package repository;

import org.springframework.data.repository.CrudRepository;

import model.Pais;

public interface PaisRepository extends CrudRepository<Pais, Long> {
}
