package staticFactory;

public class User {
    private String name;
    private String lastName;
    private String phone;

    private User() {
    }

    public static User from(String name , String latName, String phone) {
        User user = new User();
        user.name = name;
        user.lastName = latName;
        user.phone = phone;
        return user;
    }
}
