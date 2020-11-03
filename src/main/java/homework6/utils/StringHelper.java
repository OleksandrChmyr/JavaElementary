package homework6.utils;

import homework6.exceptions.StringFormatException;

public class StringHelper {
    public String stringHelperMethod(String string, char[] charArray) throws StringFormatException {

        String checkedString;

        if (charArray.length == 0) {
            throw new NullPointerException("charArray is empty");
        }

        String charsString = new String(charArray);

        if (string.trim().isBlank() || charsString.trim().isBlank()) {
            throw new StringFormatException("One of the Strings is Empty");
        } else {

            checkedString = string.toUpperCase().trim().concat(" " + charsString.toLowerCase().trim());
        }

        int middleChar;
        int numberOfChars;
        if (string.length() % 2 == 0) {
            middleChar = string.length() / 2 - 1;
            numberOfChars = 2;
        } else {
            middleChar = string.length() / 2;
            numberOfChars = 1;
        }

        return checkedString.substring(middleChar, middleChar + numberOfChars);
    }
}

