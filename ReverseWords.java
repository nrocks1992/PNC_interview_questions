/*
3. Reverse the order of words in a sentence 
“Reverse words in this sentence” -> “sentence this in words Reverse”  
“Reverse   words   in   this   sentence” -> “sentence this in words Reverse”. 
*/

public class ReverseWords {
    public static String reverseWords(String testCase){
        String[] words = testCase.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            reversed.append(words[i]);
            if(i != 0){
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    
}
