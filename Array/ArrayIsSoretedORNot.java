//Yime complexity O(n)
class CheckArray{
	public boolean checkSorted(int arr[]){
		
		for(int i=1;i<arr.length;i++){
		if(arr[i-1] <= arr[i]){
				
			}
			else
				return false;
		}
		return true;
	}
}
class ArrayIsSoretedORNot{
	public static void main(String[] args){
		CheckArray ch = new CheckArray();
		//int arr[]={6,5,5,9,0};
		int arr[]={4,5,6,6,9,10};
		boolean b = ch.checkSorted(arr);
		if(b == true){
			System.out.println("Arrays is soretd");
		}
		else{
			System.out.println("Arrays is NOT soretd");
		}
	}
}