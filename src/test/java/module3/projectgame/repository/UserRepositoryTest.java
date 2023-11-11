package module3.projectgame.repository;

import module3.projectgame.entity.User;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserRepositoryTest {
    @Mock
    UserRepository userRepository = mock(UserRepository.class);
    ArrayList<User> list = new ArrayList<>() {{
        add(mock(User.class));
        add(mock(User.class));
        add(mock(User.class));
        add(mock(User.class));
    }};
    UserRepository userRepository1 = spy(new UserRepository());


    @Test
    void givenMockUserRepository_WhenRequestUsersFromMap_ThenGetEmptyListOfUsers() {
        /*when(userRepository.getAll()).thenReturn(new ArrayList<>());
        when(userRepository.getAll()).thenReturn(list);*/
        //System.out.println(userRepository.getAll());

        assertTrue(userRepository.getAll().isEmpty());
        assertEquals(new ArrayList<User>(), userRepository.getAll());
        //System.out.println(userRepository1.getAll());
        //assertEquals(3, userRepository1.getAll().size());


    }

    @Test
    void givenSpyUserRepository_WhenRequestUsersFromMap_ThenGetListOfUsers() {
        /*when(userRepository.getAll()).thenReturn(new ArrayList<>());
        when(userRepository.getAll()).thenReturn(list);*/
        //System.out.println(userRepository.getAll());

        //assertTrue(userRepository.getAll().isEmpty());
        //System.out.println(userRepository1.getAll());
        assertEquals(3, userRepository1.getAll().size());
        assertFalse(userRepository1.getAll().isEmpty());


    }

    @Test
    void givenMockUserRepository_WhenRequestId_ThenGetException() {
        /*when(userRepository.getAll()).thenReturn(new ArrayList<>());
        when(userRepository.getAll()).thenReturn(list);*/
        //System.out.println(userRepository.getAll());

        assertFalse(userRepository.get(1L).isPresent());
        //System.out.println(userRepository1.getAll());
        //assertEquals(3, userRepository1.getAll().size());


    }

    @Test
    void givenSpyUserRepository_WhenRequestId_ThenGetUser() {
        /*when(userRepository.getAll()).thenReturn(new ArrayList<>());
        when(userRepository.getAll()).thenReturn(list);*/
        //System.out.println(userRepository.getAll());

        //assertTrue(userRepository.getAll().isEmpty());
        //System.out.println(userRepository1.getAll());
        assertEquals(User.with().name("user").id(1L).get(), userRepository1.get(1L).get());
        assertFalse(userRepository1.get(2L).isEmpty());


    }

}