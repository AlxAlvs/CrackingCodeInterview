import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String firstWord = "anagram";
        String secondWord = "nagaram";

        System.out.println(isAnagram(firstWord, secondWord));
    }

    public static boolean isAnagram(String firstWord, String secondWord){
        Map<String, Integer> charAndIndexMap = new HashMap<>();
        for (int i = 0; i < firstWord.length(); i++){
            char currentChar = firstWord.charAt(i);
            int indexToSearchForward = charAndIndexMap.getOrDefault(String.valueOf(currentChar), 0);
            int indexSearched = secondWord.indexOf(currentChar, indexToSearchForward);
            if(firstWord.length() != secondWord.length() || indexSearched < 0 ) {
                return false;
            }
            charAndIndexMap.put(String.valueOf(currentChar), indexSearched + 1);
        }

        return true;
    }
}