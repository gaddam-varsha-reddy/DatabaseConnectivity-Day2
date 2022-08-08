import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class User {
    private String fname;
    private String lname;
    private String companyName;

    User(String fname,String lname,String companyName){
        this.fname=fname;
        this.lname=lname;
        this.companyName=companyName;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return fname.equals(user.fname) && lname.equals(user.lname) && companyName.equals(user.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, companyName);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}