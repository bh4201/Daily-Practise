/*
	Time Complexity:
	Best Case = O(1), when element we are searching is present at 0th index.
	Average Case = O(n)
	Worst Case = O(n), when element we are searching for is present at last 
				index or isn't present in an array at all.
				
	Space Complexity: O(1)
*/
class SearchLinear{
	public int search(int arr[], int target){
		for(int i=0;i<arr.length;i++){
			if(target == arr[i])
				return i;
		}
		return -1;
		
	}
}

class LinearSearch{
	public static void main(String[] args){
		int[] arr ={14,25,26,42,4,1};
		int target = 4;
		SearchLinear sc = new SearchLinear();
		int result = sc.search(arr,target);
		if(result == -1){
			System.out.println("Element not found");
		}
		else
			System.out.println(target+" Element found at "+result+"th index");
	}
}