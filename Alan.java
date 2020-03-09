
public class Alan {

	public static void insertionSort(int[] nums) {
		for(int i = 1;  i <= nums.length; i++){
			int idx = i;
			if(nums[i]<nums[i-1]){
				while(nums[idx]<nums[idx-1]){
					idx--;
				}
			}
			int idx1 = i;
			int temp;

			for(int j = 0; j < i-idx; i++){
				temp = nums[i];
				nums[idx1] = nums[idx1-1];
				idx1--;

			}
		}
	}
	
	public static void selectionSort(int[] nums) {
		
		
		
	}
}
