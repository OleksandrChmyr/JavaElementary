package homework1;

public class Admin extends Human {

    public Admin() {
        setRole(Type.ADMIN);
    }

    public Admin(String email) {
        super(email);
        setRole(Type.ADMIN);
    }

    public Admin(String name, String email) {
        super(name, email);
        setRole(Type.ADMIN);
    }

    public Admin(String name, String email, Type role) {
        super(name, email, role);
        setRole(Type.ADMIN);
    }

    public Admin(String name, String surname, int age, String email, String password, Type role) {
        super(name, surname, age, email, password, role);
        setRole(Type.ADMIN);
    }


}
