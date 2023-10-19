package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;


// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        if (sentence.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        Map<String, Integer> wordsCount = new HashMap<>();
        String[] wordsOfSentence = sentence.split(" ");
        for (String word : wordsOfSentence) {
            int count = wordsCount.getOrDefault(word, 0);
            wordsCount.put(word, count + 1);
        }

        return wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        StringBuilder resultPrint = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            resultPrint.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        resultPrint.append("}");
        return resultPrint.toString();
    }
}
//END
