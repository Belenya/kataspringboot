package ru.belenya.springboot.kataspringboot.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.belenya.springboot.kataspringboot.dao.UserDao;
import ru.belenya.springboot.kataspringboot.models.User;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserService{

    private final UserDao userDAO;

    public UserService(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    public void save(User o) {
        userDAO.save(o);
    }

    public Optional<User> findById(Long id) {
        return userDAO.findById(id);
    }

    public void update(User o) {
        userDAO.save(o);
    }

    public void delete(User o) {
        userDAO.delete(o);
    }

    public List<User> findAll() {
        return (List<User>) userDAO.findAll();
    }
}
