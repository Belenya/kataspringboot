package ru.belenya.springboot.kataspringboot.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.belenya.springboot.kataspringboot.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
