import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    //has- a
    static User loggedInUser;
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Post> posts = new ArrayList<>();


    //can do
    //constructor
    //displayMenu
    //reactToUser

    public static String menu() {

        System.out.println("\n Main Menu \n");
        System.out.println("1) Create new user \n" +
                "2) Become an existing user \n" +
                "3) Create a post as the current user \n" +
                "4) Print all posts \n" +
                "5) Print all users\n" +
                "6) Quit");
        System.out.println("Choose an option from the menu. Enter 1-6: ");
        Scanner keyboard = new Scanner(System.in);
        String option = keyboard.nextLine();
        return option;


    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean anotherUser = true;

        while (anotherUser) {
            String option = menu();
            if (option.equals("6")) {
                break;

            } else if (option.equals("1")) {
                System.out.println("Enter First and Last Name: ");
                String firstLast = keyboard.nextLine();
                System.out.println("Enter url: ");
                String url = keyboard.nextLine();
                System.out.println("Username: ");
                String userName = keyboard.nextLine();
                System.out.println("Email Address: ");
                String email = keyboard.nextLine();
                User aUser = new User(url, userName, firstLast, email);
                users.add(aUser);


            } else if (option.equals("2")) {

                for (int i = 0; i < users.size(); i++) {
                    System.out.println(users.get(i).getUserName() + "");
                }
                System.out.println("Select a user from the list.");
                String userSelect = keyboard.nextLine();

                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).getUserName().equals(userSelect)) {
                        loggedInUser = users.get(i);
                        System.out.println("You are logged in as: " + loggedInUser.getUserName());

                    }
                }
            } else if (option.equals("3")) {
                Post lastPost = null;
                System.out.println("You are currently user " + loggedInUser.getUserName() + ".");
                for (int i = 0; i < posts.size(); i++) {
                    if (posts != null && !posts.isEmpty() && posts.get(i).getUser().equals(loggedInUser)) {
                        lastPost = posts.get(i);
                    }
                }

                if (lastPost != null && !posts.isEmpty() && lastPost.getUser().equals(loggedInUser)) {
                    System.out.println(lastPost);
                }

                System.out.println("Write your post here: ");
                String contents = keyboard.nextLine();
                System.out.println("Enter a web address: ");
                String webAddress = keyboard.nextLine();
                System.out.println("");
                Post aPost = new Post(loggedInUser, contents, webAddress);
                posts.add(aPost);



                } else if (option.equals("4")) {
                    for (int i = 0; i < posts.size(); i++) {
                        System.out.println(posts.get(i).getDescription());
                    }

                } else if (option.equals("5")) {

                    for (int i = 0; i < users.size(); i++) {
                        System.out.println(users.get(i).getFirstLast() + " " + users.get(i).getUrl() + " " + users.get(i).getUserName() + " " + users.get(i).getEmailAddress());
                    }


                }
            }
        }
    }





























