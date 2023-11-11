package module3.projectgame.repository;

import module3.projectgame.entity.User;

import java.util.Collection;
import java.util.Optional;

public interface Repository<T> {
    Collection<User> getAll();
    //Collection<User> find(T entity);
    Optional<T> get(Long id);
    void create(T entity);
    void update(T entity);

}
