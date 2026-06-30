# PNC Interview Questions
Java exercises for role at PNC

## 1. Find Duplicate Values in a List 
[1, 2, 3, 2, 4, 5, 1]  ->  [1, 2]  
[1, 3, 1, 5] -> [1]

## 2. Validate Email format
must contain exactly one ‘@’ symbol  
must contain ‘.’ After the ‘@’  
can not start or end with ‘@’  
can not be null/empty  

## 3. Reverse the order of words in a sentence 
“Reverse words in this sentence” -> “sentence this in words Reverse”  
“Reverse   words   in   this   sentence” -> “sentence this in words Reverse”. 

## 4. Find first unique character in a string
“automation” -> “u”  
“mama” -> null  

## 5. Validate Password Rules
Min 8 characters, max 15  
Contains at least one uppercase letter  
Contains at least one lowercase letter  
Contains at least one digit  
Contains at least one special character  
“Password123!” -> true  
“password123!” -> false  
“Password123” -> false  
“PASSWORD123!” -> false  

## 6. Group Results by Status
[“COMPLETED”, “PENDING”, “COMPLETED”, “FAILED”, “COMPLETED”, “PENDING”]  
COMPLETED - 3  
PENDING – 2  
FAILED – 1  

## 7. Remove Duplicate Strings while Preserving Order
[“COMPLETED”, “PENDING”, “COMPLETED”, “FAILED”, “COMPLETED”, “PENDING”]  ->   
[“COMPLETED”, “PENDING”, “FAILED”]  

## 8. Find the Most Frequent Word
“pass fail pass fail skip” -> “pass”  

## 9. Find Common Elements between Two Lists
list1 = [ “A”, “B”, “C”, “D” ]  
list2 = [ “C”, “D”, “E” ]  
Output: [ “C”, “D” ]  

## 10. Mask Sensitive Data (all but last 4 characters)
“123456789” -> `“*****6789”`   
“1234” -> `“1234”`  
“123-45-6789” -> `“***-**-6789”`  









