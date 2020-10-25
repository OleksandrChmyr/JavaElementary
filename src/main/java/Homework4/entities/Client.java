package Homework4.entities;

import java.util.Objects;

public class Client {
    private String clientID;
    private String surname;
    private String clientAccID;
    private double amount;

    public Client() {
    }

    public Client(String clientID, String surname, String clientAccID, double amount) {
        this.clientID = clientID;
        this.surname = surname;
        this.clientAccID = clientAccID;
        this.amount = amount;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClientAccID() {
        return clientAccID;
    }

    public void setClientAccID(String clientAccID) {
        this.clientAccID = clientAccID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Double.compare(client.amount, amount) == 0 &&
                Objects.equals(clientID, client.clientID) &&
                Objects.equals(surname, client.surname) &&
                Objects.equals(clientAccID, client.clientAccID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, surname, clientAccID, amount);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", surname='" + surname + '\'' +
                ", clientAccID='" + clientAccID + '\'' +
                ", amount=" + amount +
                '}';
    }
}
