package staticFactory;

public class User {
    private String name;
    private String lastName;
    private String ci;

    private User() {
    }

    public static User from(final String name , final String latName, final String ci) {
        User user = new User();
        user.name = name;
        user.lastName = latName;
        user.ci = ci;
        return user;
    }
}
