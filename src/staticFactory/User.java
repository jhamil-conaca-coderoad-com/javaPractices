package staticFactory;

public class User {
    private String name;
    private String lastName;

    private User() {
    }

    public static User from(String name , String latName) {
        User user = new User();
        user.name = name;
        user.lastName = latName;
        return user;
    }
}
