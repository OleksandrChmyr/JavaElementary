package homework6.main;

import homework6.exceptions.StringFormatException;
import homework6.utils.RegExHelper;
import homework6.utils.StringHelper;

public class Main {
    public static void main(String[] args) throws StringFormatException {

        char[] charArray = {' ', 'h', 'i', 'l', 'l', 'e', 'l', ' ', ' '};
        String string = "Alexdssfsdfsdfs";

        StringHelper stringHelper = new StringHelper();

        System.out.println(stringHelper.stringHelperMethod(string, charArray));

        RegExHelper regExHelper = new RegExHelper();
        regExHelper.phoneCheck("+380933250697");
        regExHelper.emailCheck("alexander.ch87@gmail.com");
        regExHelper.birthDateCheck("25.08.1987");

    }
}
