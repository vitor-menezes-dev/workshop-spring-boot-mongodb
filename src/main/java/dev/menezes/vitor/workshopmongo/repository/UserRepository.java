package dev.menezes.vitor.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.menezes.vitor.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
