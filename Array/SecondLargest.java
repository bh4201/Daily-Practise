//Time complexity o(n)
// Brutee approch will be short tthe array
// this better approch
class SecondLargest{
	public static void main(String[] args){
		int arr[]={1,2,4,7,7,5};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		int secondlargest = -1;
		for(int i=1;i<arr.length;i++){
			if(secondlargest <arr[i] && arr[i] != max){
			secondlargest = arr[i];
		}
	}
	System.out.println("secondlargest "+ secondlargest);
}
}