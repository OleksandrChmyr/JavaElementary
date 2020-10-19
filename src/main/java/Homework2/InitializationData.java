package Homework2;

import java.util.*;

//2. Создать класс “InitializationData” и метод внутри него, который будет предоставлять/наполнять данные для теста
// функционала. Этот класс в итоге должен вернуть объект класса “Information”, с наполненными данными.
// Условия наполнения:
//2.1. Наполнить тридцатью уникальными значениями каждое из 3х полей класса “Information” (можно автоматически в цикле);
//2.2. Добавить в каждое поле класса “Information” 10 одинаковых значений (Будьте внимательны при наполнении
// Списка псевдонимов пользователя, так как эта коллекция не гарантирует уникальность значений);
//2.3. При отдаче сущности “Information” созданного класса “InitializationData” необходимо чтобы размер 3х полей был
// одинаковым(List.size() == Set.size() = Map.size()). Для данной проверки и корректировки, возможно,
// Вам понадобиться дополнительный внутренний(private) метод.


public class InitializationData {

    //2.1. Наполнить тридцатью уникальными значениями каждое из 3х полей класса “Information” (можно автоматически в цикле);
    public static ArrayList<String> userNameCreator(String name, int listLimit) {
//        System.out.println("\n Печатаем nameList: \n");

        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 1; i <= listLimit; i++) {
            nameList.add(name + i);
        }
//        System.out.println(nameList);
        return nameList;

    }

    public static HashSet<String> userEmailCreator(String name, int listLimit) {
//        System.out.println("\n Печатаем email Set: \n");
        HashSet<String> emailList = new HashSet<>();
        for (int i = 1; i <= listLimit; i++) {
            emailList.add(name + i + "@gmail.com");
        }
//        System.out.println(emailList);
        return emailList;
    }

    public static HashMap<String, String> userDataCreator(ArrayList arrayList, HashSet hashSet, int listLimit) {
        Iterator iterator = hashSet.iterator();
        HashMap<String, String> userData = new HashMap<>();
        for (int i = 0; i < listLimit; i++) {
            userData.put(String.valueOf(iterator.next()), (String) arrayList.get(i));

        }
//        System.out.println("\n Печатаем Hashmap: \n" + userData);
        return userData;

    }

    //2.2. Добавить в каждое поле класса “Information” 10 одинаковых значений (Будьте внимательны при наполнении
// Списка псевдонимов пользователя, так как эта коллекция не гарантирует уникальность значений);
    //        Создаем еще два метода для добавления элементов
    public static ArrayList<String> userNameCreator2(String name, int listLimit2) {
        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 1; i <= listLimit2; i++) {
            nameList.add(name);
        }
//        System.out.println(nameList);
        return nameList;

    }

    public static HashSet<String> userEmailCreator2(String name, int listLimit2) {

        HashSet<String> emailList = new HashSet<>();
        for (int i = 1; i <= listLimit2; i++) {
            emailList.add(name + "@mail.com");
        }
//        System.out.println(emailList);
        return emailList;
    }
//2.3. При отдаче сущности “Information” созданного класса “InitializationData” необходимо чтобы размер 3х полей был
// одинаковым(List.size() == Set.size() = Map.size()). Для данной проверки и корректировки, возможно,
// Вам понадобиться дополнительный внутренний(private) метод.

    public static HashMap<String, String> checkLength(ArrayList arrayList, HashSet hashSet, int maxSize) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (i >= maxSize) {
                arrayList.remove(i);
            }

            for (int j = 0; j < hashSet.size(); j++) {
                if (j >= maxSize) {
                    arrayList.remove(j);
                }

            }

        }
        Iterator iterator = hashSet.iterator();
        HashMap<String, String> userData = new HashMap<>();
        for (int i = 0; i < maxSize; i++) {
            userData.put(String.valueOf(iterator.next()), (String) arrayList.get(i));

        }
//        System.out.println("\n Печатаем Hashmap: \n" + userData);
        return userData;

    }


}
