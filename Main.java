import java.util.*;
public class Main {
    public static void main(String[] args) {

		//1. Find Duplicate Values in a List 
        List<Integer> testCase1 = List.of(1,2,3,2,4,5,1);
		List<Integer> testCase2 = List.of(1,3,1,5);
		List<Integer> testCase3 = List.of(1,3,2,5,2,2);
		List<Integer> testCase4 = List.of(-1,-1,0,0);

		System.out.println("1. Find Duplicate Values in a List");
		System.out.println("Test Case 1: " + testCase1);
		System.out.println(FindDuplicates.findDuplicates(testCase1));
		System.out.println("Test Case 2: " + testCase2);
		System.out.println(FindDuplicates.findDuplicates(testCase2));
		System.out.println("Test Case 3: " + testCase3);
		System.out.println(FindDuplicates.findDuplicates(testCase3));
		System.out.println("Test Case 4: " + testCase4);
		System.out.println(FindDuplicates.findDuplicates(testCase4));

		//2. Validate Email format
		String[] testCaseEmails = {"test@example.com", "invalid.email", "invalid@email"};
		System.out.println("\n2. Validate Email format");
		System.out.println("Email Test Case 1: " + testCaseEmails[0]);
		System.out.println(ValidateEmail.validateEmail(testCaseEmails[0]));
		System.out.println("Email Test Case 2: " + testCaseEmails[1]);
		System.out.println(ValidateEmail.validateEmail(testCaseEmails[1]));
		System.out.println("Email Test Case 3: " + testCaseEmails[2]);
		System.out.println(ValidateEmail.validateEmail(testCaseEmails[2]));

		//3. Reverse the order of words in a sentence
		System.out.println("\n3. Reverse the order of words in a sentence");
		System.out.println(ReverseWords.reverseWords("Reverse words in this sentence"));
		System.out.println(ReverseWords.reverseWords("Reverse   words   in   this   sentence"));

		//4. Find first unique character in a string
		System.out.println("\n4. Find first unique character in a string");
		System.out.println("Test Case 1: \"automation\"");
		System.out.println(FindFirstUniqueCharacter.findFirstUniqueCharacter("automation"));
		System.out.println("Test Case 2: \"mama\"");
		System.out.println(FindFirstUniqueCharacter.findFirstUniqueCharacter("mama"));

		//5. Validate Password Rules
		System.out.println("\n5. Validate Password Rules");
		System.out.println("Test Case 1: " + "Password123!");
		System.out.println(ValidatePassword.validatePassword("Password123!"));
		System.out.println("Test Case 2: " + "password123!");
		System.out.println(ValidatePassword.validatePassword("password123!"));
		System.out.println("Test Case 3: " + "Password!");
		System.out.println(ValidatePassword.validatePassword("Password123"));
		System.out.println("Test Case 4: " + "PASSWORD123!");
		System.out.println(ValidatePassword.validatePassword("PASSWORD123!"));

		//6. Group Results by Status
		System.out.println("\n6. Group Results by Status");
		String[] testCase5 = {"COMPLETED", "PENDING", "COMPLETED", "FAILED", "COMPLETED", "PENDING"};
		System.out.println("Input: " + Arrays.toString(testCase5));
		GroupResultsByStatus.groupResultsByStatus(testCase5);

		//7. Remove Duplicate Strings while Preserving Order
		System.out.println("\n7. Remove Duplicate Strings while Preserving Order");
		String[] testCase6 = {"COMPLETED", "PENDING", "COMPLETED", "FAILED", "COMPLETED", "PENDING"};
		String[] result = RemoveDuplicateStrings.removeDuplicateStrings(testCase6);
		System.out.println("Input: " + Arrays.toString(testCase6));
		System.out.println(Arrays.toString(result));

		//8. Find the Most Frequent Word
		System.out.println("\n8. Find the Most Frequent Word");
		System.out.println("Input: \"pass fail pass fail skip\"");
		System.out.println(FindMostFrequentWord.findMostFrequentWord("pass fail pass fail skip"));

		//9. Find Common Elements between Two Lists
		String[] list1 = {"A", "B", "C", "D"};
		String[] list2 = {"C", "D", "E"};
		List<String> commonElements = FindCommonElements.findCommonElements(list1, list2);

		System.out.println("\n9. Find Common Elements between Two Lists");
		System.out.println("List 1: " + Arrays.toString(list1));
		System.out.println("List 2: " + Arrays.toString(list2));
		System.out.println("Output: " + commonElements);

		//10. Mask Sensitive Data (all but last 4 characters)
		System.out.println("\n10. Mask Sensitive Data (all but last 4 characters)");
		System.out.println("Input: 123456789");
		System.out.println("Output: " + MaskSensitiveData.maskSensitiveData("123456789"));
		System.out.println("Input: 1234");
		System.out.println("Output: " + MaskSensitiveData.maskSensitiveData("1234"));
		System.out.println("Input: 123-45-6789");
		System.out.println("Output: " + MaskSensitiveData.maskSensitiveData("123-45-6789"));

    }
}