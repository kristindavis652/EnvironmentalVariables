public class Post {
    //has-a
    private User user;
    private int number;
    private String contents;
    private String webAddress;
    private static int nextPostNumber = 1;


    //can-do
    //constructor
    //int getPostNumber()
    //toString



    public Post(User user, String contents, String webAddress) {
        this.number = nextPostNumber;
        nextPostNumber++;
        this.contents = contents;
        this.webAddress = webAddress;
        this.user = user;

    }

    public String getDescription() {
        return user + " " + contents + " " + webAddress;
    }
    public int getPostNumber() {
        return this.number;
    }
    public String getContents() {
        return this.contents;
    }
    public String toString() {return this.contents; }
    public User getUser() {return this.user;}



}


