import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class InMemoryStorageUserManager implements UserManager{
    private List<User> list = new ArrayList<>();
    private int n;
    private User user;

    @Override
    public void addUser(User user) {
        list.add(user);
        System.out.println(user.getFirstName()+" is added to list");
    }
    @Override
    public List<User> listUsers() {
       return list;
    }

    @Override
    public void deleteUser(String firstName) {
        Iterator userListIterator = list.iterator();
        boolean flag=true;
        while (userListIterator.hasNext()) {
            User user = (User) userListIterator.next();
            if (user.getFirstName().equals(firstName)){
                userListIterator.remove();
                System.out.println(user.getFirstName()+" is removed from list");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(firstName+"is not in list");
        }
    }

    @Override
    public ArrayList<User> searchUsers(String firstName) {
        boolean flag=true;
       ArrayList<User> watchlist =new ArrayList<>();
        for (User listItem : list) {
            if (listItem.getFirstName().equals(firstName)) {
                System.out.println(listItem.getFirstName()+" is found in list");
                watchlist.add(listItem);
                flag=false;
            }
        }
        if(flag){
            System.out.println(firstName + " is not in list");
        }
        return watchlist;
    }
    @Override
    public void updateUser(User user){
        boolean flag=true;
        for (User listItem : list) {
            if (listItem.getFirstName().equals(user.getFirstName())) {
                listItem.setLastName(user.getLastName());
                listItem.setCompanyName(user.getCompanyName());
                System.out.println(user.getFirstName() + " is updated in list");
                flag=false;
                break;
            }
        }
            if(flag){
                System.out.println(user.getFirstName() +" is not found in list");
            }

    }
}
