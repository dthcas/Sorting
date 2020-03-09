
public class David {
	
	public static void insertionSort(int[] nums) {

		for (int j = 1; j < nums.length; j++) {

				int temp = nums[j];
				int possibleIndex = j;

				while (possibleIndex > 0 && temp < nums[possibleIndex - 1]) {

					nums[possibleIndex] = nums[possibleIndex - 1];
					possibleIndex--;    // Line 10
				}

				nums[possibleIndex] = temp;
		}
	}
	
	public static void selectionSort(int[] nums) {
		
		for (int j = 0; j < nums.length - 1; j++) {
			
			int minIndex = j;
			for (int k = j + 1; k < nums.length; k++) {
				if (nums[k] < nums[minIndex]) {
					minIndex = k;
				}
			}

			if (j != minIndex) {

				int temp = nums[j];
				nums[j] = nums[minIndex];
				nums[minIndex] = temp;    // Line 19
			}
		}
	}
	
	
}
