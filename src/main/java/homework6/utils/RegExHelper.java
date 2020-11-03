package homework6.utils;

public class RegExHelper {

    public boolean phoneCheck(String phoneNumber) {
//        формат номера +380ХХХХХХХХХ (9 цифр без пробелов)
        boolean result = phoneNumber.matches("(\\+380*)\\d{9}");
        if (result) {
            System.out.println("Your phone number is accepted");
        } else {
            System.out.println("Your phone number is not valid");
        }

        return result;
    }

    public boolean emailCheck(String email) {
//        формат мыла (принимает символы, слова, тире, точки) + @ + (принимает символы, слова, тире, точки) + . + максимум 3 символа
        boolean result = email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        if (result) {
            System.out.println("Your email is accepted");
        } else {
            System.out.println("Your email is not valid");
        }

        return result;
    }

    public boolean birthDateCheck(String birthDate) {
//        формат даты  mm/dd/yyyy
        boolean result = birthDate.matches("^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$");
        if (result) {
            System.out.println("Your date of birth is accepted");
        } else {
            System.out.println("Your date of birth is not valid");
        }

        return result;
    }
}
