// in BinarySearch arrys should be shorted

class Bsearch{
	public void search(int arr[], int target){
		
	}
	
}
public class BinarySearch{
	public static void main(String[] args){
		int[] arr ={14,25,26,42,4,1};
		int target = 4;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] > arr[i+1]){
				int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
			}
		}
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
	}
}