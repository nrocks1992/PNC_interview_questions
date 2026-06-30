import java.util.*;
public class Main {
    public static void main(String[] args) {

		//1. Find Duplicate Values in a List 
        List<Integer> testCase1 = List.of(1,2,3,2,4,5,1);
		List<Integer> testCase2 = List.of(1,3,1,5);
		List<Integer> testCase3 = List.of(1,3,2,5,2,2);
		List<Integer> testCase4 = List.of(-1,-1,0,0);
		
		System.out.println(FindDuplicates.findDuplicates(testCase1));
		System.out.println(FindDuplicates.findDuplicates(testCase2));
		System.out.println(FindDuplicates.findDuplicates(testCase3));
		System.out.println(FindDuplicates.findDuplicates(testCase4));

		//2. Validate Email format
		System.out.println(ValidateEmail.validateEmail("test@example.com"));
		System.out.println(ValidateEmail.validateEmail("invalid.email"));

		//3. Reverse the order of words in a sentence
		System.out.println(ReverseWords.reverseWords("Reverse words in this sentence"));
		System.out.println(ReverseWords.reverseWords("Reverse   words   in   this   sentence"));

		//4. Find first unique character in a string
		System.out.println(FindFirstUniqueCharacter.findFirstUniqueCharacter("automation"));
		System.out.println(FindFirstUniqueCharacter.findFirstUniqueCharacter("mama"));

		//5. Validate Password Rules
		System.out.println(ValidatePassword.validatePassword("Password1!"));
		System.out.println(ValidatePassword.validatePassword("password"));
		
		//6. Group Results by Status
		String[] testCase5 = {"COMPLETED", "PENDING", "COMPLETED", "FAILED", "COMPLETED", "PENDING"};
		GroupResultsByStatus.groupResultsByStatus(testCase5);

		//7. Remove Duplicate Strings while Preserving Order
		String[] testCase6 = {"COMPLETED", "PENDING", "COMPLETED", "FAILED", "COMPLETED", "PENDING"};
		String[] result = RemoveDuplicateStrings.removeDuplicateStrings(testCase6);
		System.out.println(Arrays.toString(result));

		//8. Find the Most Frequent Word
		System.out.println(FindMostFrequentWord.findMostFrequentWord("pass fail pass fail skip"));

		//9. Find Common Elements between Two Lists
		String[] list1 = {"A", "B", "C", "D"};
		String[] list2 = {"C", "D", "E"};
		List<String> commonElements = FindCommonElements.findCommonElements(list1, list2);
		System.out.println("Output: " + commonElements);

		//10. Mask Sensitive Data (all but last 4 characters)
		System.out.println(MaskSensitiveData.maskSensitiveData("123456789"));
		System.out.println(MaskSensitiveData.maskSensitiveData("1234"));
		System.out.println(MaskSensitiveData.maskSensitiveData("123-45-6789"));

    }
}