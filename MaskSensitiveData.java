/*
10. Mask Sensitive Data (all but last 4 characters)
“123456789” -> `“*****6789”`   
“1234” -> `“1234”`  
“123-45-6789” -> `“***-**-6789”`
*/

public class MaskSensitiveData {
    public static String maskSensitiveData(String testCase){
        if(testCase.length() <= 4){
            return testCase;
        }
        StringBuilder masked = new StringBuilder();
        for(int i = 0; i < testCase.length() - 4; i++){
            if(Character.isDigit(testCase.charAt(i))){
                masked.append("*");
            } else {
                masked.append(testCase.charAt(i));
            }
        }
        masked.append(testCase.substring(testCase.length() - 4));
        return masked.toString();
    }
    
}
