/*
1. Find Duplicate Values in a List 
[1, 2, 3, 2, 4, 5, 1]  ->  [1, 2]
[1, 3, 1, 5] -> [1]
*/
import java.util.*;

public class FindDuplicates
{
    public static List<Integer> findDuplicates(List<Integer> testCase){
        
        List<Integer> dupes = new ArrayList<>();
        List<Integer> seen = new ArrayList<>();
 
        for(int i = 0; i < testCase.size(); i++){
            if(seen.contains(testCase.get(i)) && !dupes.contains(testCase.get(i))){
                dupes.add(testCase.get(i));
            }
            else{
                seen.add(testCase.get(i));
            }
        }
        return dupes;
    }
}