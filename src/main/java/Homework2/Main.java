package Homework2;

import java.util.*;

import static Homework2.InitializationData.*;

public class Main {
    public static void main(String[] args) {
        int listLimit = 30;
        int listLimit2 = 10;
        int maxSize = 31;
        int randomSize = 10;
        String name1 = new String("John");
        String name2 = new String("Dan");

//
//        information.setUserName(userNameCreator(listLimit));
//        information.setUserEmail(userEmailCreator(listLimit));

        ArrayList<String> userNamelist = new ArrayList<>(userNameCreator(name1, listLimit));
        System.out.println("\n userNamelist \n" + userNamelist);
        HashSet<String> userEmailSet = new HashSet<>(userEmailCreator(name1, listLimit));
        System.out.println("\n userEmailSet \n" + userEmailSet);

        HashMap<String, String> usersHashMap = new HashMap<>(userDataCreator(userNamelist, userEmailSet, listLimit));
        System.out.println("\n usersHashMap \n" + usersHashMap);

        //2.2. Добавить в каждое поле класса “Information” 10 одинаковых значений (Будьте внимательны при наполнении
// Списка псевдонимов пользователя, так как эта коллекция не гарантирует уникальность значений);
//        Создаем еще два метода для добавления элементов

        ArrayList<String> userNamelist2 = new ArrayList<>(userNameCreator2(name2, listLimit2));
        System.out.println("\n userNamelist2 \n" + userNamelist2);
        userNamelist.addAll(userNamelist2);
        System.out.println("\n userNamelist Updated \n" + userNamelist);

        HashSet<String> userEmailSet2 = new HashSet<>(userEmailCreator2(name2, listLimit2));
        System.out.println("\n userEmailSet2 \n" + userEmailSet2);
        userEmailSet.addAll(userEmailSet2);
        System.out.println("\n userEmailSet Updated \n" + userEmailSet);

        HashMap<String, String> usersHashMap2 = new HashMap<>(userDataCreator(userNamelist, userEmailSet, listLimit));
        System.out.println("\n usersHashMap2 \n" + usersHashMap2);


//2.3. При отдаче сущности “Information” созданного класса “InitializationData” необходимо чтобы размер 3х полей был
// одинаковым(List.size() == Set.size() = Map.size()). Для данной проверки и корректировки, возможно,
// Вам понадобиться дополнительный внутренний(private) метод.
        HashMap<String, String> usersHashMap3 = new HashMap<>(checkLength(userNamelist, userEmailSet, maxSize));
        System.out.println("\n usersHashMap3 \n" + usersHashMap3);


        Information information = new Information(userNamelist, userEmailSet, usersHashMap3);
        ArrayList<Integer> userToAdd = new ArrayList<Integer>(additionalUsersRandom(randomSize));
        System.out.println("\n userToAdd:\n" + userToAdd);

        System.out.println("\nInformation entity before adding: \n" + information);

        additionalUsers(userToAdd, information);

        System.out.println("\nInformation entity final: \n" + information);
    }
//        3. В классе Main создайте еще один дополнительный внутренний метод, который на вход будет принимать
//        2 параметра (1- список из любых оберток примитивов(Byte, Integer….), тут необходимо подумать про wildcards;
//        2-полученная переменная “Information”), и возвращать он будет обработанный “Information”.

    public static Information additionalUsers(ArrayList<? extends Number> userToAdd, Information information) {
//        В этом методе необходимо написать следующую логику:
//        3.1. пройтись по всему списку переданному и преобразовав значение в строку записать в список псевдонимов
//        пользователя;

        ArrayList<String> nameList = new ArrayList<>();
        for (int i = 0; i < userToAdd.size(); i++) {
            userToAdd.get(i);
            nameList.add(String.valueOf(i));
        }

//        3.2. Далее к данному значению добавить какое-нибудь заданное значение(например: @mail.ua) и записать в набор
//        почт пользователя и Мапу их соотношения;

        HashSet<String> emailSet = new HashSet<>();
        for (int i = 0; i < userToAdd.size(); i++) {
            emailSet.add(nameList.get(i) + "@mail.com");
        }

        Iterator iterator = emailSet.iterator();
        HashMap<String, String> userData = new HashMap<>();
        for (int i = 0; i < userToAdd.size(); i++) {
            userData.put(String.valueOf(iterator.next()), nameList.get(i));

        }
        information.setUserName(nameList);
        information.setUserEmail(emailSet);
        information.setUserData(userData);

        return information;
    }


//        3.3. Так же необходимо реализовать проверку уже существующей почты в наборе и не записывать данное значение в
//        случае совпадения


    private static ArrayList<Integer> additionalUsersRandom(int n) { // метод для рандомного создания списка оберток
        // примитивов для задания 3.

        ArrayList<Integer> arrayRandom = new ArrayList<Integer>(n);

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < n; i++) {
            Integer r = rand.nextInt();
//            Math.pow(r,2);
            arrayRandom.add(r);
        }

        return arrayRandom;
    }

}
