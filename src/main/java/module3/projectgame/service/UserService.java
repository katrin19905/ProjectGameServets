package module3.projectgame.service;

import module3.projectgame.entity.User;
import module3.projectgame.repository.Repository;
import module3.projectgame.repository.UserRepository;

import java.util.Collection;
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

    public Collection<User> getAll() {
        return userRepository.getAll();
    }

    public Optional<User> get(long id) {
        return userRepository.get(id);
    }
}
