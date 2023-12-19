package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> firstMap, Map<String, Object> secondMap) {
        LinkedHashMap<String, String> resultMap = new LinkedHashMap<>();

        Set<String> allKeys = new TreeSet<>(firstMap.keySet());
        allKeys.addAll(secondMap.keySet());

        for (String key : allKeys) {
            if (firstMap.containsKey(key) && secondMap.containsKey(key)) {
                Object value1 = firstMap.get(key);
                Object value2 = secondMap.get(key);

                if (value1.equals(value2)) {
                    resultMap.put(key, "unchanged");
                } else {
                    resultMap.put(key, "changed");
                }
            } else if (firstMap.containsKey(key)) {
                resultMap.put(key, "deleted");
            } else if (secondMap.containsKey(key)) {
                resultMap.put(key, "added");
            }
        }

        return resultMap;
    }
}
//END
