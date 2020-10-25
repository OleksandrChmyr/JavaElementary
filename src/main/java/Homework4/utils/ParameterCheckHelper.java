package Homework4.utils;

import Homework4.exceptions.UserExpectedError;
import Homework4.exceptions.WrongFieldException;
import Homework4.exceptions.WrongSumException;

public class ParameterCheckHelper {

    public static void checkClientIDLength(String clientAccID, int idLength) throws WrongFieldException {
        if (clientAccID.length() != idLength) {
            throw new WrongFieldException("Your ID must be 10 digits long");
        }
    }

    public static void checkAmount (double amount, double amountLimit) throws WrongSumException {
            if (amount > amountLimit) {
                throw new WrongSumException("Your maximum transfer limit is" + String.valueOf(amountLimit));
            }
    }
    public static void checkTargetUser (String clientAccID, String clientAccID2) throws UserExpectedError {
        if (clientAccID.equals(clientAccID2)){
            throw new UserExpectedError("Operation is not valid. You can not transfer money to your current account, " +
                    "please choose another clientID number");
        }
    }
}
