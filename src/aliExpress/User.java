package aliExpress;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class User {
    private String userName;
    private String email;
    private Date dateRegistration;
    private Otziv[] otzivFromUser = new Otziv[1];

    public User() {
    }

    public User(String userName, String email, Date dateRegistration) {
        this.userName = userName;
        this.email = email;
        this.dateRegistration = dateRegistration;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Otziv[] getOtzivFromUser() {
        return otzivFromUser;
    }

    public void setOtzivFromUser(Otziv[] otzivFromUser) {
        this.otzivFromUser = otzivFromUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserName(), user.getUserName()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getDateRegistration(), user.getDateRegistration()) &&
                Arrays.equals(getOtzivFromUser(), user.getOtzivFromUser());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getUserName(), getEmail(), getDateRegistration());
        result = 31 * result + Arrays.hashCode(getOtzivFromUser());
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", dateRegistration=" + dateRegistration +
                ", otzivFromUser=" + Arrays.toString(otzivFromUser) +
                '}';
    }
}
