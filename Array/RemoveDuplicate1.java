//Remove duplicate element from sorted array and unique element\
//Time complexity 
import java.util.*;

class RemoveDuplicate1 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2, 2, 3, 4,5};
		int n = arr.length;
		
		int count = 1;
		
        
        for (int i = 0; i <n-1; i++) {
           if(arr[i] != arr[i+1])
		   {
			 count++;
		   }
		   
        }
		
	
		  int newarr[] = new int[count];
		  	int j = 0;
			newarr[j++]=arr[0];
		  for (int i = 0; i <n-1; i++) {
           if(arr[i] != arr[i+1])
		   {
				newarr[j++] = arr[i+1];
		   }
		   
        }
		
		
        for (int i = 0; i <newarr.length; i++) {
			System.out.println(newarr[i]);
		}
        System.out.println("Unique elements: "+count);
    }
}
