
import java.util.Arrays;
import java.util.Scanner;


public class java
{  
public static void main(String[] args)  
{  
	int count = 12, temp;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter number of elements you want in the array: ");
	int firstArray[] = {1,3,7,2,9,4};
	System.out.print("enter 2nd array");
	int secondArray[] = {4,6,2,7,9,6};  
int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
int[] mergedArray = new int[length];    //resultant array  
int pos = 0;  
for (int element : firstArray) //copying elements of secondArray using for-each loop  
{  
mergedArray[pos] = element;  
pos++;              //increases position by 1  
}  
for (int element : secondArray) //copying elements of firstArray using for-each loop  
{  
mergedArray[pos] = element;  
pos++;  
}  
System.out.println(Arrays.toString(mergedArray)); 

for (int i = 0; i < count; i++) 
{
}
scan.close();
for (int i = 0; i < count; i++) 
{
    for (int j = i + 1; j < count; j++) { 
        if (mergedArray[i] > mergedArray[j]) 
        {
            temp = mergedArray[i];
            mergedArray[i] = mergedArray[j];
            mergedArray[j] = temp;
        }
    }
}
System.out.print("Array Elements in Ascending Order: ");
for (int i = 0; i < count - 1; i++) 
{
    System.out.print(mergedArray[i] + ", ");
}
System.out.print(mergedArray[count - 1]);}
public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }}}
	return nums;
}  
} 
//prints the resultant array


//User inputs the array size


