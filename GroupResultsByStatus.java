/*
6. Group Results by Status
[“COMPLETED”, “PENDING”, “COMPLETED”, “FAILED”, “COMPLETED”, “PENDING”]  
COMPLETED - 3  
PENDING – 2  
FAILED – 1   
*/

public class GroupResultsByStatus {
    public static void groupResultsByStatus(String[] testCase){
        int completed = 0;
        int pending = 0;
        int failed = 0;

        for(String status : testCase){
            if(status.equals("COMPLETED")){
                completed++;
            }
            else if(status.equals("PENDING")){
                pending++;
            }
            else if(status.equals("FAILED")){
                failed++;
            }
        }

        System.out.println("COMPLETED - " + completed);
        System.out.println("PENDING - " + pending);
        System.out.println("FAILED - " + failed);
    }
    
}
