package exercise;

// import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> "male".equals(user.get("gender")))
                .sorted((user1, user2) -> {
                    String birthday1 = user1.get("birthday");
                    String birthday2 = user2.get("birthday");
                    LocalDate date1 = LocalDate.parse(birthday1);
                    LocalDate date2 = LocalDate.parse(birthday2);
                    return date1.compareTo(date2);
                })
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
}
// END
