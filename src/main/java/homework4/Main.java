package homework4;

import homework4.entities.Client;
import homework4.exceptions.WrongFieldException;
import homework4.exceptions.WrongSumException;
import homework4.services.TransactionServices;
import homework4.utils.ParameterCheckHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxAccIDLength = 10;
        double amountLimit = 1000;
        Client client = new Client();
        Client client2 = new Client();
        String validAccID2 = new String();

        boolean isFieldValid = false;
        do {
            System.out.println("Please enter Client Account ID #1");
            Scanner scanner = new Scanner(System.in);
            String clientAccID = scanner.nextLine();
            try {
                ParameterCheckHelper.checkClientIDLength(clientAccID, maxAccIDLength);
                isFieldValid = true;
                client.setClientAccID(clientAccID);
                System.out.println(client);
            } catch (WrongFieldException e) {
                System.out.println(e.getMessage());
                System.out.println("ID not valid. Please Try again. ");
            }
        } while (!isFieldValid);
        System.out.println("Client Account ID #1 is acceptable ");

        boolean isFieldValid2 = false;
        do {
            System.out.println("Please enter Client Account ID #2");
            Scanner scanner = new Scanner(System.in);
            String clientAccID2 = scanner.nextLine();
            try {
                ParameterCheckHelper.checkClientIDLength(clientAccID2, maxAccIDLength);
                isFieldValid2 = true;
                client2.setClientAccID(clientAccID2);
                System.out.println(client2);

            } catch (WrongFieldException e) {
                System.out.println(e.getMessage());
                System.out.println("ID not valid. Please Try again. ");
            }
        } while (!isFieldValid2);
        System.out.println("Client Account ID #2 is acceptable ");



        boolean isFieldValid3 = false;

        do {
            System.out.println("Please enter amount");
            Scanner scanner = new Scanner(System.in);
            double amount = Double.parseDouble(scanner.nextLine());
            try {
                ParameterCheckHelper.checkAmount(amount, amountLimit);
                isFieldValid3 = true;
            } catch (WrongSumException e) {
                System.out.println(e.getMessage());
                System.out.println("Amount exceeds the limit, please enter valid amount");
            }
        } while (!isFieldValid3);
        System.out.println("Client Account ID #2 is acceptable ");

        validAccID2 = client2.getClientAccID();
        TransactionServices.moneyTransfer(client,validAccID2);
    }
}

