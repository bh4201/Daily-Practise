//Remove duplicate element from sorted array and unique element\
//Time complexity 
import java.util.*;

class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,2, 2, 3, 4, 1, 2, 3, 4, 5};
        Set<Integer> st = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        
        System.out.println("Unique elements: " + st);
    }
}
