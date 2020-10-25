package homework1;
// Задание1. Создать 2 класса (entity): User & Admin. У обоих классов должны быть поля: имя, фамилия, возраст, почта,
// пароль и роль. (Тут необходимо подумать про принципы ООП и правильно написать два класса, чтобы не было одинакового
// кода в обоих классах, возможно, выделить общий класс для обеих сущностей, и чтобы поля были защищены от прямого
// доступа).

// Коментарий: Создаем абстрактный класс Human, от которого будут наследоваться классы User и Admin для соблюдения
// условий // задачи и принципов ООП.  Класс Human абстрактный, потому что на данный момент он нужен для создания
// сущности для // классов наследников и введения основных параметров этих сущностей.

import java.util.Objects;

public abstract class Human {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String password;
    private Type role;

    public Human() {
    }

    public Human(String email) {
        this.email = email;
    }

    public Human(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Human(String name, String email, Type role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public Human(String name, String surname, int age, String email, String password, Type role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Type getRole() {
        return role;
    }

    public void setRole(Type role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(email, human.email) &&
                Objects.equals(password, human.password) &&
                Objects.equals(role, human.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email, password, role);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    enum Type {
        USER,
        ADMIN,
    }

}
