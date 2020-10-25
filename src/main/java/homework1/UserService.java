package homework1;
//3. Дальше необходимо создать 2 сервиса: UserService & AdminService. У обоих этих классов полиморфное поведением
// прописанных далее методов. Чтобы выполнить полиморфизм в данном случае необходимо заключить контракт
// (Подсказка: применить Interface).

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService implements ServiceContract {

    // Контракт состоит из следующих методов:

//3.1. "Проверить пользователя": Метод принимает входящим параметром пользователя(User или Admin) - вспоминаем про
// Динамическую диспетчеризацию (кто забыл). В ходе выполнения данного метода идет вычитка из файлика данных и сверка
// есть ли в этом файлике почта, как у пользователя которого передали в этот метод. (Файлик с данными необходимо
// подготовить самостоятельно заранее. Для удобства каждое значение пишите с новой строки в файлике). Подсказка:
// Чтобы вычитать данные из файла используем FileReader. И после проверки метод возвращает нашел или нет (true/false).
// Данная логика одинакова как для UserService, так и для AdminService.

    @Override
    public boolean checkUser(Human human) throws IOException {

        String path = "src/main/resources/HT1/UserList";

        FileReader userReader = new FileReader(path);
        Scanner userScanner = new Scanner(userReader);
        while (userScanner.hasNextLine()) {
            String user = userScanner.nextLine();
            if (user.equalsIgnoreCase(human.getEmail())) {
                System.out.println("User found");
                return true;
            }
        }
        userScanner.close();
        userReader.close();
        System.out.println("User not found");
        return false;
    }


//   3.2. "Записать данные пользователя": Метод принимает входящим параметром пользователя(User или Admin) - как метод
//   выше. В ходе выполнения вычитывает все данные по переданному пользователю и записывает в файлик(для удобства каждое
//   значение с новой строки). И ничего не возвращает в ответ. Данный метод доступен только в AdminService, в
//   UserService просто выводить сообщение о недоступности данного метода в сервисе.

    @Override
    public void writeUserData(Human human) {
        if (human instanceof User) {
            System.out.println("Service unavailable for Users");
        }
        if (human instanceof Admin) {
            System.out.println("Please use AdminService");
        }
    }
}
