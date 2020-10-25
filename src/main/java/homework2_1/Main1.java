package homework2_1;

import java.util.ArrayList;
import java.util.Random;

import static homework2_1.InitializationData.informationInitData;
import static homework2_1.InitializationData.informationInitData2;

public class Main1 {
    public static void main(String[] args) {
        int listLimit = 30;
        int listLimit2 = 10;
        int randomSize = 10;
        String name1 = new String("John");
        String name2 = new String("Dan");


//2.3. При отдаче сущности “Information” созданного класса “InitializationData” необходимо чтобы размер 3х полей был
// одинаковым(List.size() == Set.size() = Map.size()). Для данной проверки и корректировки, возможно,
// Вам понадобиться дополнительный внутренний(private) метод.


        Information information = new Information();

        informationInitData(information, name1, listLimit);
        System.out.println("\n First method call \n" + informationInitData(information, name1, listLimit));

        informationInitData2(information,name2,listLimit2);
        System.out.println("\n Second method call \n" + informationInitData2(information,name2,listLimit2));


//        создание списка "оберток"
        ArrayList<Integer> userToAdd = new ArrayList<Integer>(additionalUsersRandom(randomSize));
        System.out.println("\n userToAdd:\n" + userToAdd);

        System.out.println("\nInformation entity before adding: \n" + information);
//      добавление новых юзеров к Классу Information:
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


        for (int i = 0; i < userToAdd.size(); i++) {
            information.getUserName().add(String.valueOf(userToAdd.get(i)));
            //        3.2. Далее к данному значению добавить какое-нибудь заданное значение(например: @mail.ua) и записать в набор
//        почт пользователя и Мапу их соотношения;
            if (!information.getUserName().contains(String.valueOf(userToAdd.get(i)))) {//3.3. Так же необходимо
                // реализовать проверку уже существующей почты в наборе и не записывать данное значение в случае совпадения
                information.getUserEmail().add(String.valueOf(userToAdd.get(i)) + "@mail.com");
            }

            information.getUserData().put(String.valueOf(information.getUserEmail()), String.valueOf(userToAdd.get(i)));

        }

        return information;
    }





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
