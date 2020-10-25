package homework2_1;

import java.util.*;

//1. Создайте класс “Information”, у которого будет 3 переменных:
//1.1. Список псевдонимов пользователя(List) - тут будет храниться список строковых значений;
//1.2. Набор почт пользователя(Set) - тут будет храниться набор почт потенциальных пользователей.
// Данная коллекция обеспечит уникальность записей без дублей. Так же строковое значение;
//1.3. Мапа соотношений “почта-псевдоним” - тут будет записываться соотношение какой почте соответствует какой псевдоним.
// Почта является ключом Мапы!
public class Information {
    private ArrayList <String> userName;
    private HashSet <String> userEmail;
    private HashMap<String,String> userData;

    public Information() {
        userName = new ArrayList<>();
        userEmail = new HashSet<>();
        userData = new HashMap<>();
    }

    public Information(ArrayList<String> userName, HashSet<String> userEmail, HashMap<String, String> userData) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userData = userData;
    }

    public ArrayList<String> getUserName() {
        return userName;
    }

    public void setUserName(ArrayList<String> userName) {
        this.userName = userName;
    }

    public HashSet<String> getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(HashSet<String> userEmail) {
        this.userEmail = userEmail;
    }

    public HashMap<String, String> getUserData() {
        return userData;
    }

    public void setUserData(HashMap<String, String> userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Information that = (Information) o;
        return Objects.equals(userName, that.userName) &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userData, that.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userEmail, userData);
    }

    @Override
    public String toString() {
        return "Information{" +
                "userName=" + userName +
                ", userEmail=" + userEmail +
                ", userData=" + userData +
                '}';
    }
}
