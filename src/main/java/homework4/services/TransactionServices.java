package homework4.services;


import homework4.entities.Client;
import homework4.utils.ParameterCheckHelper;

public class TransactionServices {
    public static void moneyTransfer(Client client, String clientAcc2ID) {
        ParameterCheckHelper.checkTargetUser(client.getClientAccID(), clientAcc2ID);
    }
}
