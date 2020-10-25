package homework4;

import com.sun.org.apache.xpath.internal.operations.String;
import homework4.exceptions.WrongFieldException;
import homework4.utils.ParameterCheckHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxAccIDLength = 10;
//isFieldValid = false;
//do {
////введите значение
// try {
// // проверка значения
// //все ок (isFieldValid = true;)
// } catch (Exception e) {
// //печаль. Попробуйте ввести еще раз
//}
//} while(!isFieldValid);
        String clientAccID = new String();

        clientAccID.length == maxAccIDLength = false;
        do {
            System.out.println("Please enter your Client Account ID");
            Scanner scanner = new Scanner(System.in);
            String clientAccID2 = scanner.nextLine();
            try {
                ParameterCheckHelper.checkClientIDLength(clientAccID, maxAccIDLength);
            } catch (WrongFieldException e) {
                System.out.println(e.getMessage());
                System.out.println("ID not valid. Try again: ");
                e.printStackTrace();
            }
        } while (!(clientAccID.length == maxAccIDLength));

    }
}

