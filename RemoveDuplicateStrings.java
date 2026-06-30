/*
7. Remove Duplicate Strings while Preserving Order
[“COMPLETED”, “PENDING”, “COMPLETED”, “FAILED”, “COMPLETED”, “PENDING”]  ->   
[“COMPLETED”, “PENDING”, “FAILED”]  
*/
public class RemoveDuplicateStrings {
    public static String[] removeDuplicateStrings(String[] testCase){
        java.util.List<String> uniqueStrings = new java.util.ArrayList<>();
        for(String s : testCase){
            if(!uniqueStrings.contains(s)){
                uniqueStrings.add(s);
            }
        }
        return uniqueStrings.toArray(new String[0]);
    }

}
