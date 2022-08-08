import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;


public class UserManagerTest {

        @Test
        public void addUser() {
            UserManager userManager = new InMemoryStorageUserManager();
            userManager.addUser(new User("varsha","reddy","pramati"));

            assertEquals(1, userManager.listUsers().size());
        }

        @Test
        public void listUsers() {

        }

        @Test
        public void deleteUser() {
            UserManager userManager = new InMemoryStorageUserManager();
            userManager.addUser(new User("varsha","reddy","pramati"));
            assertEquals(1, userManager.listUsers().size());
            userManager.deleteUser("varsha");
            assertEquals(0, userManager.listUsers().size());
        }

        @Test
        public void searchUsers() {
        }

        @Test
        public void updateUser() {
        }
    }
