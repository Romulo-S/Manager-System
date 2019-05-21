package repository;

import org.springframework.data.repository.CrudRepository;

import model.Token;

public interface TokenRepository extends CrudRepository<Token, Long> {

}
