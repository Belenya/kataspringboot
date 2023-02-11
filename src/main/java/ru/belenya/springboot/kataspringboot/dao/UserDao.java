package ru.belenya.springboot.kataspringboot.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.belenya.springboot.kataspringboot.models.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
}
