/* 
9. Find Common Elements between Two Lists
list1 = [ “A”, “B”, “C”, “D” ]  
list2 = [ “C”, “D”, “E” ]  
Output: [ “C”, “D” ]  
*/
import java.util.*;
public class FindCommonElements {
    public static List<String> findCommonElements(String[] list1, String[] list2) {
        List<String> commonElements = new ArrayList<>();
        for (String element : list1) {
            for (String element2 : list2) {
                if (element.equals(element2)) {
                    commonElements.add(element);
                    break;
                }
            }
        }
        return commonElements;
    }
    
}
