package ru.belenya.springboot.kataspringboot.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.belenya.springboot.kataspringboot.repositories.UserRepository;
import ru.belenya.springboot.kataspringboot.models.User;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserService implements AbstractService<User, Long>{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User o) {
        userRepository.save(o);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public void update(User o) {
        userRepository.save(o);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
}
