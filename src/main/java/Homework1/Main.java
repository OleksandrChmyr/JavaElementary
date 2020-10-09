package Homework1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        4. После того как все классы написаны, в классе Main запустить программу с определенной логикой:

//        4.1. Создать 2 разных сущности User & Admin
//        User userTom = new User("tom@gmail.com");
//        Admin adminSam = new Admin("sam@gmail.com");

        User userTom = new User("Tom","tom@gmail.com");
        Admin adminSam = new Admin("Sam","sam@gmail.com");
        User userDon = new User("don@gmail.com");

//        4.2. С любым из сущностей вызвать UserService(Записать данные пользователя) - убедиться, что наш запрет
//        работает и выводиться нужное сообщение
        UserService userService = new UserService();
        userService.writeUserData(userTom);
        userService.writeUserData(adminSam);


//        4.3. С каждой из сущностей вызвать AdminService(Записать данные пользователя) - сохранить данные в файлик
        AdminService adminService = new AdminService();
        adminService.writeUserData(userTom);
        adminService.writeUserData(adminSam);
//        4.4. С сущностью Admin вызвать сервис UserService(Проверить пользователя) - убедиться что данный пользователь
//        есть в файлике
        userService.checkUser(adminSam);

//        4.5. С сущностью User вызвать сервис AdminService(Проверить пользователя) - убедиться что данный пользователь
//        есть в файлике
        adminService.checkUser(userTom);
        adminService.checkUser(userDon);

    }
}
