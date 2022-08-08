import java.util.ArrayList;
import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<User> userList = new ArrayList<>();
        System.out.println("1-Adding Users");
        System.out.println("2-Deleting Users");
        System.out.println("3.Search User");
        System.out.println("4.Display All Users");
        System.out.println("5.Update User");
        System.out.println("6.Exit");
        System.out.println("Enter n value");
        int n=sc.nextInt();
        InMemoryStorageUserManager obj=new InMemoryStorageUserManager();
        while(n!=6) {
            switch (n) {
                case 1:
                    System.out.println("Enter first name:");
                    String fname = sc.next();
                    System.out.println("Enter last name:");
                    String lname = sc.next();
                    System.out.println("Enter_user_company_name:");
                    String companyName=sc.next();
                    obj.addUser(new User(fname,lname,companyName));
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter user first name which you want to remove");
                    String s=sc.next();
                    obj.deleteUser(s);
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Enter user first name whom you want to search");
                    obj.searchUsers(sc.next());
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 4:
                    userList=obj.listUsers();
                    for(User i:userList){
                        System.out.println(i.getFname()+" " +i.getLname()+" " +i.getCompanyName());
                    }
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 5:
                    System.out.println("Enter user first name whom you want to update");
                    fname = sc.next();
                    System.out.println("Last name:");
                    lname = sc.next();
                    System.out.println("Company name:");
                    companyName=sc.next();
                    obj.updateUser(new User(fname,lname,companyName));
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;

                case 6:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Enter a valid number");

            }
        }
    }
}
