import java.util.Arrays;

public class Warren {

	
	
	
	public static void insertionSort(int[] nums) {
		
		insertionSortBinary(nums);
		//insertionSortRecursive(nums);
		
	}
	
	public static void selectionSort(int[] nums) {
		
		selectionSortIterative(nums);
		//selectionSortRecursive(nums);
		
	}
	
	public static void insertionSortBinary(int[] nums) {
		for (int i = 1; i < nums.length; i++) { 
            int x = nums[i]; 
  
            // Find location to insert using binary search 
            int j = Math.abs(Arrays.binarySearch(nums, 0, i, x) + 1); 
  
            // Shifting array to one location right 
            System.arraycopy(nums, j, nums, j+1, i-j);      
  
            // Placing element at its correct location 
            nums[j] = x; 
        } 
	}
	
	public static void insertionSortRecursive(int[] nums, int n) {
		// Base case 
        if (n <= 1) return; 
       
        // Sort first n-1 elements 
        insertionSortRecursive(nums, n-1); 
       
        // Insert last element at its correct position in sorted array. 
        int last = nums[n-1]; 
        int j = n-2; 
       
        // Move elements of nums[0..i-1], that are  greater than key,
        // to one position ahead  of their current position
        while (j >= 0 && nums[j] > last) { 
            nums[j+1] = nums[j]; 
            j--; 
        } 
        nums[j+1] = last; 
	}
	
	public static void selectionSortIterative(int[] nums) {
		int n = nums.length;
		
		for (int i = 0; i < n-1; i++) { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (nums[j] < nums[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = nums[min_idx]; 
            nums[min_idx] = nums[i]; 
            nums[i] = temp; 
        } 
	}
	
	private static int minIndex(int a[], int i, int j) { 
        if (i == j) return i; 
       
        // Find minimum of remaining elements 
        int k = minIndex(a, i + 1, j); 
       
        // Return minimum of current and remaining. 
        return (a[i] < a[k])? i : k; 
    } 
	
	public static void selectionSortRecursive(int[] nums, int n, int index) {
		// Return when starting and size are same 
        if (index == n) 
           return; 
       
        // calling minimum index function for minimum index 
        int k = minIndex(nums, index, n-1); 
       
        // Swapping when index nd minimum index are not same 
        if (k != index){ 
           // swap 
           int temp = nums[k]; 
           nums[k] = nums[index]; 
           nums[index] = temp; 
        } 
        // Recursively calling selection sort function 
        selectionSortRecursive(nums, n, index + 1); 
	}
}
