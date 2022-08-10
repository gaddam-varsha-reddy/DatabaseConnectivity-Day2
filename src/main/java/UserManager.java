import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface UserManager {


    void addUser(User user);
    List<User> listUsers();

    void deleteUser(String s);

    List<User> searchUsers(String firstName);

    void updateUser(User user);
}
