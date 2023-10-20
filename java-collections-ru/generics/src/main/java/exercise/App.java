package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books,
                                                      Map<String, String> searchCriteria) {
        List<Map<String, String>> booksMatch = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean isMatch = true;

            for (Map.Entry<String, String> criteria : searchCriteria.entrySet()) {
                String key = criteria.getKey();
                String value = criteria.getValue();

                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                booksMatch.add(book);
            }
        }
        return booksMatch;
    }
}
//END
