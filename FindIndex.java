package in.programming;

public class FindIndex {
	
	public static int findIndex(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
			
		}
		return -1;
	} 
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9};
		int targetElement = 5;
		int index = findIndex(arr, targetElement);
		if(index != -1) {
			System.out.println("Index of"+targetElement+"is:"+index);
		}else {
			System.out.println(targetElement+"Target element no found in an array");
		}
		int targetElement7 = 7;
		int index7 = findIndex(arr, targetElement7);
		if(index != -1) {
			System.out.println("Index of"+targetElement7+"is:"+index7);
		}else {
			System.out.println(targetElement7+"Target element no found in an array");
		}
		
	}

}
