package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emailsList) {
        long result = emailsList.stream()
                .map(email -> email.toLowerCase())
                .filter(email -> email.endsWith("gmail.com")
                        || email.endsWith("yandex.ru")
                        || email.endsWith("hotmail.com"))
                .count();

        return (int) result;
    }
}
// END
