import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String input = "ferel";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        char[] charArray = input.toCharArray();
        int lenght = charArray.length;
        int soloCharacterCount = 0;
        if(lenght % 2 == 0){
            soloCharacterCount = 1;
        }

        for (int i = 0; i < charArray.length; i++ ) {
            char currentChar = charArray[i];
            long ocurrences = input.chars().filter(ch -> ch == currentChar).count();

            if (ocurrences % 2 != 0){
                soloCharacterCount++;
            }
            if (soloCharacterCount == 2){
                return false;
            }
        }

        return true;
    }
}