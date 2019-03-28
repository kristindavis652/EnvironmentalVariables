import java.util.ArrayList;

public class User {

    //has-a
    private String url;
    private String userName;
    private String firstLast;
    private String emailAddress;
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Post> posts = new ArrayList<>();

    //can-do
    //Constructor
    //void addPost (Post p)
    //Post[] getPosts()
    //toString

    public User(String url, String userName, String firstLast, String emailAddress) {
        this.url = url;
        this.userName = userName;
        this.firstLast = firstLast;
        this.emailAddress = emailAddress;


    }

    public String getUserName() {
        return this.userName;
    }

    public String getFirstLast() {
        return this.firstLast;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return this.url + " " + this.userName + " " + this.firstLast + " " + this.emailAddress;
    }



}














