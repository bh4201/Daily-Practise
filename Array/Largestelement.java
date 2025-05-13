//time complexity O(n)
class Largestelement{
	public static void main(String[] args){
		int arr[]={6,5,8,9,0};
		int max= arr[0];
		for(int i=1;i<arr.length;i++){
			if(max < arr[i]){
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}