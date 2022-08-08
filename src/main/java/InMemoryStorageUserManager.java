import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public  class InMemoryStorageUserManager implements UserManager{
    Scanner sc = new Scanner(System.in);
    ArrayList<User> list = new ArrayList<>();
    int n;
    @Override
    public void addUser(User user) {
        list.add(user);
        //System.out.println("added");
    }
    @Override
    public ArrayList<User> listUsers() {
        //System.out.println("list users");
       return list;
    }

    @Override
    public void deleteUser(String s) {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            User x = (User) itr.next();
            if (x.getFname().equals(s)){
                itr.remove();
                //System.out.println("Removed");
                break;
            }
        }
    }

    @Override
    public ArrayList<User> searchUsers(String searchWord) {
       ArrayList<User> matchlist =new ArrayList<>();
        for (User i : list) {
            if (i.getFname().equals(searchWord)) {
                //users.remove(Integer.valueOf(n));
                //System.out.println("name found");
                matchlist.add(i);
            }
        }
        return matchlist;
    }
    @Override
    public void updateUser(User user){
        for (User i : list) {
            if(i.getFname().equals(user.getFname())){
                i.setLname(user.getLname());
                i.setCompanyName(user.getCompanyName());
                //System.out.println("updated");
            }
            /*
            else{
                System.out.println("User not found");
            }*/
        }
    }
}
