package module3.projectgame.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

class UserTest {
    @Mock
    User user1 = mock(User.class);
    User user = User.with().name("User").get();


    @ParameterizedTest
    @CsvSource({
            "John, John",
            "Kate, Kate",
            "Olga, Olga"})
    void givenUser_WhenUserHaveName_ThenGetName(String expected, String name) {
        //String expected = "User";
        String actual = User.with().name(name).get().getName();
        assertEquals(expected, actual);
    }

    @Test
    void givenUser_WhenUserDoNotHaveName_ThenGetNull() {
        assertNull(User.with().get().getName());
    }

    @Test
    void givenUser_WhenUserHaveId_ThenGetId() {
        Long expected1 = 1L;
        Long expected2 = -1L;
        Long expected3 = 10L;
        Long actual1 = User.with().id(1L).get().getId();
        Long actual2 = User.with().id(-1L).get().getId();
        Long actual3 = User.with().id(10L).get().getId();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    @Test
    void givenUser_WhenUserDoNotHaveId_ThenGetNull() {
        assertNull(User.with().get().getId());
    }

    @Test
    void givenUser_WhenSetNullName_ThenGetException() {
        doThrow(new NullPointerException()).when(user1).setName(null);
    }

    @ParameterizedTest
    @CsvSource({
            "John, John",
            "Kate, Kate",
            "Olga, Olga"})
    void givenUser_WhenSetName_ThenThisNameIsSet(String expected, String name) {
        User user2 = User.with().get();
        user2.setName(name);
        String actual = user2.getName();
        assertEquals(expected, actual);
    }


    @Test
    void givenUser_WhenSetId_ThenThisIdIsSet() {
        Long expected1 = 1L;
        Long expected2 = -1L;
        Long expected3 = 10L;
        User user21 = User.with().get();
        User user22 = User.with().get();
        User user23 = User.with().get();
        user21.setId(1L);
        user22.setId(-1L);
        user23.setId(10L);
        Long actual1 = user21.id;
        Long actual2 = user22.id;
        Long actual3 = user23.id;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    @Test
    void givenUser_WhenSetNullId_ThenGetException() {
        doThrow(new NullPointerException()).when(user1).setId(null);
    }

}