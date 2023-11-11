package module3.projectgame.repository;

import module3.projectgame.entity.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

public class UserRepository implements Repository<User> {
    private final Map<Long, User> map = new HashMap<>();
    public static final AtomicLong id = new AtomicLong(System.currentTimeMillis());

    public UserRepository() {
        map.put(1L, User.with()
                .name("user").id(1L).get());
        map.put(2L, User.with()
                .name("guest1").id(2L).get());
        map.put(3L, User.with()
                .name("guest2").id(3L).get());


    }

    @Override
    public Collection<User> getAll() {
        return map.values();
    }

    @Override
    public Optional<User> get(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public void create(User entity) {

        update(entity);
    }

    @Override
    public void update(User entity) {

        map.put(getId(), entity);

    }



    public static Long getId() {
        long l = System.currentTimeMillis();
        ThreadLocalRandom current = ThreadLocalRandom.current();
        long l1 = current.nextLong(1L, 10000000000000L);

        return l+l1;
    }


}
