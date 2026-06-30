/* 
8. Find the Most Frequent Word
“pass fail pass fail skip” -> “pass”
*/

public class FindMostFrequentWord {
    public static String findMostFrequentWord(String testCase){
        String[] words = testCase.split(" ");
        String mostFrequentWord = "";
        int maxCount = 0;
        for(String word : words){
            int count = 0;
            for(String w : words){
                if(word.equals(w)){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
    
}
