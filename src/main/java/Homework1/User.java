package Homework1;

public class User extends Human {


    public User() {
        setRole(Type.USER);
    }

    public User(String email) {
        super(email);
        setRole(Type.USER);
    }

    public User(String name, String email) {
        super(name, email);
        setRole(Type.USER);
    }

    public User(String name, String email, Type role) {
        super(name, email, role);
        setRole(Type.USER);
    }

    public User(String name, String surname, int age, String email, String password, Type role) {
        super(name, surname, age, email, password, role);
        setRole(Type.USER);
    }


}
