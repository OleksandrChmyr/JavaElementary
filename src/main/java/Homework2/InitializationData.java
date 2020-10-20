package Homework2;


import java.util.*;

public class InitializationData {
    //2. Создать класс “InitializationData” и метод внутри него, который будет предоставлять/наполнять данные для теста
// функционала. Этот класс в итоге должен вернуть объект класса “Information”, с наполненными данными.


    //2.1. Наполнить тридцатью уникальными значениями каждое из 3х полей класса “Information” (можно автоматически в цикле);
    public static Information informationInitData(Information information, String name, int listLimit) {
        for (int i = 1; i <= listLimit; i++) {
//            ArrayList<String> names = new ArrayList<>();
//            names.add(name + i);
//            information.setUserName(names);
//            HashSet<String> emails = new HashSet<>();
//            emails.add(name + "gmail.com");
//            information.setUserEmail(emails);
//            HashMap<String, String> usersHashMap = new HashMap<>();
//            usersHashMap.put(name + i, name + "gmail.com");
//
//            information.setUserData(usersHashMap);
//        }

            information.getUserName().add(name + i);
            information.getUserEmail().add(name + i + "gmail.com");
            information.getUserData().put(name + i + "gmail.com", name + i);
        }


        return information;

    }


    //2.2. Добавить в каждое поле класса “Information” 10 одинаковых значений (Будьте внимательны при наполнении
// Списка псевдонимов пользователя, так как эта коллекция не гарантирует уникальность значений);
    //        Создаем еще два метода для добавления элементов

    public static Information informationInitData2(Information information, String name, int listLimit2) {

        for (int i = 1; i <= listLimit2; i++) {

            if (!information.getUserName().contains(name)) {
                information.getUserName().add(name);
            }
            information.getUserEmail().add(name + "mail.com");
            information.getUserData().put(name + "mail.com", name);


        }
        return information;
    }
}

//2.3. При отдаче сущности “Information” созданного класса “InitializationData” необходимо чтобы размер 3х полей был
// одинаковым(List.size() == Set.size() = Map.size()). Для данной проверки и корректировки, возможно,
// Вам понадобиться дополнительный внутренний(private) метод.


