import java.util.List;
import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Adding Users");
        System.out.println("2-Deleting Users");
        System.out.println("3.Search User");
        System.out.println("4.Display All Users");
        System.out.println("5.Update User");
        System.out.println("6.Exit");
        System.out.println("Enter n value");
        int n=sc.nextInt();
        InMemoryStorageUserManager userManager =new InMemoryStorageUserManager();
        while(n!=6) {
            switch (n) {
                case 1:
                    System.out.println("Enter first name:");
                    String firstName = sc.next();
                    System.out.println("Enter last name:");
                    String lastName = sc.next();
                    System.out.println("Enter_user_company_name:");
                    String companyName=sc.next();
                    userManager.addUser(new User(firstName,lastName,companyName));
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter user first name which you want to remove");
                    String username=sc.next();
                    userManager.deleteUser(username);
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Enter user first name whom you want to search");
                    userManager.searchUsers(sc.next());
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 4:
                    List<User> userList=userManager.listUsers();
                    for(User listItem:userList){
                        System.out.println(listItem.getFirstName()+" " +listItem.getLastName()+" " +listItem.getCompanyName());
                    }
                    System.out.println("Enter n value");
                    n=sc.nextInt();
                    break;
                case 5:
                    System.out.println("Enter user first name whom you want to update");
                    firstName = sc.next();
                    System.out.println("Last name:");
                    lastName = sc.next();
                    System.out.println("Company name:");
                    companyName=sc.next();
                    userManager.updateUser(new User(firstName,lastName,companyName));
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
