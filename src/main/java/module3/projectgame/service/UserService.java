package lesson11.test.newproject.service;

import lesson11.test.newproject.entity.User;
import lesson11.test.newproject.repository.Repository;
import lesson11.test.newproject.repository.UserRepository;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public enum UserService {
    INSTANCE;



    private final Repository<User> userRepository = new UserRepository();
    public void create(User user) {
        userRepository.create(user);
    }

    public void update (User user) {
        userRepository.update(user);
    }
    public void delete (User user) {
        userRepository.delete(user);
    }
    public Collection<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> get(long id) {
        return userRepository.get(id);
    }
}
