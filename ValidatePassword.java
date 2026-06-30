/*
5. Validate Password Rules
Min 8 characters, max 15  
Contains at least one uppercase letter  
Contains at least one lowercase letter  
Contains at least one digit  
Contains at least one special character  
“Password123!” -> true  
“password123!” -> false  
“Password123” -> false  
“PASSWORD123!” -> false  
*/

public class ValidatePassword {
    public static boolean validatePassword(String testCase){
        if(testCase.length() < 8 || testCase.length() > 15){
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for(int i = 0; i < testCase.length(); i++){
            char c = testCase.charAt(i);
            if(Character.isUpperCase(c)){
                hasUppercase = true;
            }
            else if(Character.isLowerCase(c)){
                hasLowercase = true;
            }
            else if(Character.isDigit(c)){
                hasDigit = true;
            }
            else{
                hasSpecialChar = true;
            }
        }
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
    
}
