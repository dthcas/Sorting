
public class Beckham {

	public static void insertionSort(int[] nums){
        for(int j = 1; j < nums.length; j++){  
            int cur = nums[j];  
            int i = j;  
            while ((i > 0)&&(nums[i-1] > cur)){  
                nums [i] = nums [i-1];  
                i--;  
            }  
            nums[i] = cur;  
        }  
	}
	
	public static void selectionSort(int[] nums){
		for(int i = 0; i < nums.length; i++){  
            int cur = i;  
            for (int j = i + 1; j < nums.length; j++){  
                if (nums[j] < nums[cur]){  
                    cur = j;
                }  
            }  
            int min = nums[cur];   
            nums[cur] = nums[i];  
            nums[i] = min;  
        }  
	}
}
