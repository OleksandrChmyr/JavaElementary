package Homework1;

//3. Дальше необходимо создать 2 сервиса: UserService & AdminService. У обоих этих классов полиморфное поведением
// прописанных далее методов. Чтобы выполнить полиморфизм в данном случае необходимо заключить контракт
// (Подсказка: применить Interface).

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AdminService extends UserService{

    @Override
    public void writeUserData(Human human) throws IOException {


        String path = "src/main/resources/HT1/UserList";
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Path directories = Files.createDirectories(pathToFile.getParent());
        }
        FileWriter userWriter = new FileWriter(path, true);
        Human.Type role = human.getRole();
        String name = human.getName();
        String email = human.getEmail();
        userWriter.write(String.valueOf(role));
        userWriter.write("\n");
        userWriter.write(name);
        userWriter.write("\n");
        userWriter.write(email);
        userWriter.write("\n");
        userWriter.close();
    }


}
