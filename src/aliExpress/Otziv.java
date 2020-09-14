package aliExpress;

import java.util.Date;
import java.util.Objects;

public class Otziv {
    private int stars;
    private Date datePublish;
    private User user;
    private String textFromOtziv;

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTextFromOtziv() {
        return textFromOtziv;
    }

    public void setTextFromOtziv(String textFromOtziv) {
        this.textFromOtziv = textFromOtziv;
    }

    public Otziv() {
    }

    public Otziv(int stars, Date datePublish, User user, String textFromOtziv) {
        this.stars = stars;
        this.datePublish = datePublish;
        this.user = user;
        this.textFromOtziv = textFromOtziv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Otziv)) return false;
        Otziv otziv = (Otziv) o;
        return getStars() == otziv.getStars() &&
                Objects.equals(getDatePublish(), otziv.getDatePublish()) &&
                Objects.equals(getUser(), otziv.getUser()) &&
                Objects.equals(getTextFromOtziv(), otziv.getTextFromOtziv());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStars(), getDatePublish(), getUser(), getTextFromOtziv());
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "stars=" + stars +
                ", datePublish=" + datePublish +
                ", user=" + user +
                ", textFromOtziv='" + textFromOtziv + '\'' +
                '}';
    }
}
