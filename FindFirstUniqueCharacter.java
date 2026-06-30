/* 
4. Find first unique character in a string
“automation” -> “u”  
“mama” -> null  
*/

public class FindFirstUniqueCharacter {
    public static Character findFirstUniqueCharacter(String testCase){
        for(int i = 0; i < testCase.length(); i++){
            if(testCase.indexOf(testCase.charAt(i)) == testCase.lastIndexOf(testCase.charAt(i))){
                return testCase.charAt(i);
            }
        }
        return null;
    }
    
}
