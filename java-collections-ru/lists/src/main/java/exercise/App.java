package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String symbols, String word) {
        char[] charsSymbols = symbols.toCharArray();
        char[] wordSymbols = word.toCharArray();

        List<String> symbolsArray = new ArrayList<>();
        List<String> wordArray = new ArrayList<>();

        for (char charsSymbol : charsSymbols) {
            symbolsArray.add(String.valueOf(charsSymbol).toLowerCase());
        }

        for (char wordSymbol : wordSymbols) {
            wordArray.add(String.valueOf(wordSymbol).toLowerCase());
        }

        Collections.sort(symbolsArray);
        Collections.sort(wordArray);

        boolean result = true;
        int resultSize = 0;

        for (String wordSymbol : wordArray){
            if (symbolsArray.contains(wordSymbol)){
                symbolsArray.remove(wordSymbol);
                resultSize +=1;
            } else {
                result = false;
            }
        }
        if (resultSize != wordArray.size()){
            result = false;
        }

return result;
    }
}
//END
