/*
2. Validate Email format
must contain exactly one ‘@’ symbol  
must contain ‘.’ After the ‘@’  
can not start or end with ‘@’  
can not be null/empty  
*/

public class ValidateEmail {
    public static boolean validateEmail(String testCase){
        if(testCase == null || testCase.isEmpty()){
            return false;
        }
        if(testCase.startsWith("@") || testCase.endsWith("@")){
            return false;
        }
        int atCount = 0;
        for(int i = 0; i < testCase.length(); i++){
            if(testCase.charAt(i) == '@'){
                atCount++;
            }
        }
        if(atCount != 1){
            return false;
        }
        int atIndex = testCase.indexOf('@');
        if(!testCase.substring(atIndex).contains(".")){
            return false;
        }
        return true;
    }
    
}
