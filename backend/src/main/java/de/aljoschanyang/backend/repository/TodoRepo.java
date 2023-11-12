package de.aljoschanyang.backend.repository;

import de.aljoschanyang.backend.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends MongoRepository<Todo, String> {
}
